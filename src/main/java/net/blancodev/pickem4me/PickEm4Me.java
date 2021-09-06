package net.blancodev.pickem4me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickEm4Me {

    public static void main(String[] args) {

        printPicksStats(getPicksMethod1());
        printPicksStats(getPicksMethod2());


    }

    private static List<NFLGame> getPicksMethod1() {

        final List<NFLGame> picks = new ArrayList<>();

        for (NFLWeek nflWeek : getWeeksStartingAt(1)) {

            NFLGame chosenGame = null;

            for (NFLGame nflGame : nflWeek.getGames()) {
                if (chosenGame == null || nflGame.getPowerDifference() > chosenGame.getPowerDifference()) {
                    if (picks.stream().noneMatch(g -> g.getHigherPoweredTeam() == nflGame.getHigherPoweredTeam())) {
                        chosenGame = nflGame;
                    }
                }
            }

            picks.add(chosenGame);

        }

        return picks;

    }

    private static List<NFLGame> getPicksMethod2() {

        final List<NFLGame> picks = new ArrayList<>();

        for (NFLWeek nflWeek : getWeeksStartingAt(1)) {

            NFLGame chosenGame = null;

            for (NFLGame nflGame : nflWeek.getGames()) {
                if (chosenGame == null || nflGame.getPowerDifference() > chosenGame.getPowerDifference()) {
                    if (picks.stream().noneMatch(g -> g.getHigherPoweredTeam() == nflGame.getHigherPoweredTeam())) {
                        //chosenGame = nflGame;

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
                                  /*  System.out.println("---");
                                    System.out.println("FOUND BETTER");
                                    System.out.println("Current: " + nflGame.getHigherPoweredTeam() + " - " + nflGame.getPowerDifference());
                                    System.out.println("Better: " + gameWithTeam.getHigherPoweredTeam() + " - " + gameWithTeam.getPowerDifference());
                                    System.out.println("---");*/
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

    private static NFLWeek[] getWeeksStartingAt(int week) {
        if (week > 17) {
            return new NFLWeek[0];
        }
        return Arrays.copyOfRange(NFLWeek.values(), week - 1, NFLWeek.values().length);
    }

    private static void printPicksStats(List<NFLGame> picks) {

        System.out.println("-".repeat(25));

        for (NFLGame pick : picks) {

            System.out.println(pick.getHigherPoweredTeam() + " - " + pick.getPowerDifference() + " (" + pick.getHome() + " vs " + pick.getAway() + ")");

        }

        System.out.println("Average Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).average().getAsDouble());
        System.out.println("Highest Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).max().getAsInt());
        System.out.println("Lowest Power Difference: " + picks.stream().mapToInt(NFLGame::getPowerDifference).min().getAsInt());

        System.out.println("-".repeat(25));

    }

}
