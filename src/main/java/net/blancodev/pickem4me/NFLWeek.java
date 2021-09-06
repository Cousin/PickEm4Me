package net.blancodev.pickem4me;

import java.util.Arrays;

public enum NFLWeek {

    WEEK_1(

            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.BALTIMORE_RAVENS)

    ),
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
