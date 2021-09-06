package net.blancodev.pickem4me;

public class NFLGame {

    protected static NFLGame of(NFLTeam home, NFLTeam away) {
        return new NFLGame(home, away);
    }

    private final NFLTeam home;
    private final NFLTeam away;

    private NFLGame(NFLTeam home, NFLTeam away) {
        this.home = home;
        this.away = away;
    }

    public NFLTeam getHigherPoweredTeam() {
        return getHome().getPowerRanking() < getAway().getPowerRanking() ? getHome() : getAway();
    }

    public int getPowerDifference() {
        return Math.abs(getHome().getPowerRanking() - getAway().getPowerRanking());
    }

    public NFLTeam getHome() {
        return home;
    }

    public NFLTeam getAway() {
        return away;
    }
}
