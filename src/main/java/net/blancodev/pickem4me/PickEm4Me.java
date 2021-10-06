package net.blancodev.pickem4me;

import java.util.*;

public class PickEm4Me {

    private static final Set<NFLTeam> ALREADY_CHOSEN = new HashSet<>();
    private static final int CURRENT_WEEK = 5;

    public static void main(String[] args) {

        ALREADY_CHOSEN.add(NFLTeam.SAN_FRANCISCO_49ERS);
        ALREADY_CHOSEN.add(NFLTeam.TAMPA_BAY_BUCCANEERS);
        ALREADY_CHOSEN.add(NFLTeam.BALTIMORE_RAVENS);
        ALREADY_CHOSEN.add(NFLTeam.BUFFALO_BILLS);

        printPicksStats(getPicksMethod1());
        printPicksStats(getPicksMethod2());

    }

    /**
     * Method #1 (currently using) for picking teams
     * This method is very basic and just finds the highest power difference game of the week and picks that
     * @return the chosen picks
     */
    private static List<NFLGame> getPicksMethod1() {

        final List<NFLGame> picks = new ArrayList<>();

        for (NFLWeek nflWeek : getWeeksStartingAt(CURRENT_WEEK)) {

            NFLGame chosenGame = null;

            for (NFLGame nflGame : nflWeek.getGames()) {
                if (chosenGame == null || nflGame.getPowerDifference() > chosenGame.getPowerDifference()) {
                    if (!ALREADY_CHOSEN.contains(nflGame.getHigherPoweredTeam()) && picks.stream().noneMatch(g -> g.getHigherPoweredTeam() == nflGame.getHigherPoweredTeam())) {
                        chosenGame = nflGame;
                    }
                }
            }

            picks.add(chosenGame);

        }

        return picks;

    }

    /**
     * Method #2 (partially unfinished)
     * This method is intended to find the highest power difference games, but does not pick that team if they can be used to be even higher powered later on
     * This method has it's flaws though and in beginning weeks causes very low power difference picks
     * @return the chosen picks
     */
    private static List<NFLGame> getPicksMethod2() {

        final List<NFLGame> picks = new ArrayList<>();

        for (NFLWeek nflWeek : getWeeksStartingAt(CURRENT_WEEK)) {

            NFLGame chosenGame = null;

            for (NFLGame nflGame : nflWeek.getGames()) {
                if (chosenGame == null || nflGame.getPowerDifference() > chosenGame.getPowerDifference()) {
                    if (!ALREADY_CHOSEN.contains(nflGame.getHigherPoweredTeam()) && picks.stream().noneMatch(g -> g.getHigherPoweredTeam() == nflGame.getHigherPoweredTeam())) {

                        boolean foundBetterWeek = false;
                        for (NFLWeek futureWeek : getWeeksStartingAt(nflWeek.getWeekNumber() + 1)) {

                            NFLGame gameWithTeam = futureWeek.getGameByTeam(nflGame.getHigherPoweredTeam());
                            if (gameWithTeam == null) {
                                continue;
                            } else {
                                if (gameWithTeam.getHigherPoweredTeam() != nflGame.getHigherPoweredTeam()) {
                                    continue;
                                }

                                if (gameWithTeam.getPowerDifference() - nflGame.getPowerDifference() > 5) {
                                    foundBetterWeek = true;
                                    break;
                                }
                            }
                        }

                        if (!foundBetterWeek) {
                            chosenGame = nflGame;
                        }

                    }
                }
            }

            picks.add(chosenGame);

        }

        return picks;

    }

    /**
     * Creates and returns an array of every week starting at (inclusive) the provided week
     * @param week the week to start at
     * @return array of {@link NFLWeek}
     */
    private static NFLWeek[] getWeeksStartingAt(int week) {
        if (week > 17) {
            return new NFLWeek[0];
        }
        return Arrays.copyOfRange(NFLWeek.values(), week - 1, NFLWeek.values().length);
    }

    /**
     * Print the stats of a chosen list of {@link NFLGame}
     * @param picks the chosen games
     */
    private static void printPicksStats(List<NFLGame> picks) {

        System.out.println("-".repeat(25));

        for (NFLGame pick : picks) {

            System.out.println((picks.indexOf(pick) + CURRENT_WEEK) + ": " + pick.getHigherPoweredTeam() + " - " + pick.getPowerDifference() + " vs " + pick.getLowerPoweredTeam());

        }

        System.out.println("Average Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).average().getAsDouble());
        System.out.println("Highest Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).max().getAsInt());
        System.out.println("Lowest Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).min().getAsInt());

        System.out.println("-".repeat(25));

    }

}
