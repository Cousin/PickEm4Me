package net.blancodev.pickem4me;

public class NFLGame {

    /**
     * Protected method to create NFLGame object, for aesthetics especially within the {@link NFLWeek} enum
     * @param home the home team
     * @param away the away team
     * @return the created NFLGame
     */
    protected static NFLGame of(NFLTeam home, NFLTeam away) {
        return new NFLGame(home, away);
    }

    private final NFLTeam home;
    private final NFLTeam away;

    private NFLGame(NFLTeam home, NFLTeam away) {
        this.home = home;
        this.away = away;
    }

    /**
     * Determines which team is the higher powered tank based on power ranking
     * @return higher powered team
     */
    public NFLTeam getHigherPoweredTeam() {
        return getHome().getPowerRanking() < getAway().getPowerRanking() ? getHome() : getAway();
    }

    /**
     * Determines which team is the lower powered tank based on power ranking
     * @return lower powered team
     */
    public NFLTeam getLowerPoweredTeam() {
        return getHome().getPowerRanking() > getAway().getPowerRanking() ? getHome() : getAway();
    }

    /**
     * Calculate the difference in power rankings between the home and away team, absolute value to ensure its positive
     * @return the power difference
     */
    public int getPowerDifference() {
        return Math.abs(getHome().getPowerRanking() - getAway().getPowerRanking());
    }

    /**
     * @return the home team of this game
     */
    public NFLTeam getHome() {
        return home;
    }

    /**
     * @return the away team of this game
     */
    public NFLTeam getAway() {
        return away;
    }
}
