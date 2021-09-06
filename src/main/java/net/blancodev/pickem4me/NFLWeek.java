package net.blancodev.pickem4me;

import java.util.Arrays;

public enum NFLWeek {

    WEEK_1(),
    WEEK_2(),
    WEEK_3(),
    WEEK_4(),
    WEEK_5(),
    WEEK_6(),
    WEEK_7(),
    WEEK_8(),
    WEEK_9(),
    WEEK_10(),
    WEEK_11(),
    WEEK_12(),
    WEEK_13(),
    WEEK_14(),
    WEEK_15(),
    WEEK_16(),
    WEEK_17();

    final NFLGame[] games;

    NFLWeek(NFLGame... games) {
        this.games = games;
    }

    public NFLGame getGameByTeam(NFLTeam nflTeam) {
        return Arrays.stream(games).filter(g -> g.getHome() == nflTeam || g.getAway() == nflTeam).findFirst().orElse(null);
    }

    public NFLGame[] getGames() {
        return games;
    }
}
