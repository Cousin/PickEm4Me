package net.blancodev.pickem4me;

public enum NFLTeam {

    ARIZONA_CARDINALS,
    TAMPA_BAY_BUCCANEERS,
    LOS_ANGELES_RAMS,
    GREEN_BAY_PACKERS,
    BUFFALO_BILLS,
    DALLAS_COWBOYS,
    CINCINNATI_BENGALS,
    BALTIMORE_RAVENS,
    TENNESSEE_TITANS,
    LOS_ANGELES_CHARGERS,
    LAS_VEGAS_RAIDERS,
    CLEVELAND_BROWNS,
    NEW_ORLEANS_SAINTS,
    KANSAS_CITY_CHIEFS,
    PITTSBURGH_STEELERS,
    INDIANAPOLIS_COLTS,
    MINNESOTA_VIKINGS,
    NEW_ENGLAND_PATRIOTS,
    ATLANTA_FALCONS,
    SAN_FRANCISCO_49ERS,
    DENVER_BRONCOS,
    CHICAGO_BEARS,
    SEATTLE_SEAHAWKS,
    CAROLINA_PANTHERS,
    PHILADELPHIA_EAGLES,
    WASHINGTON_FOOTBALL_TEAM,
    NEW_YORK_GIANTS,
    MIAMI_DOLPHINS,
    JACKSONVILLE_JAGUARS,
    NEW_YORK_JETS,
    HOUSTON_TEXANS,
    DETROIT_LIONS;

    /**
     * The NFL ranks every team each week in a list called 'Power Rankings'
     * Every week depending on how good or bad each team did, they get moved
     * Number 1 (or in our case 0) is considered the best team in the league
     * @return the power ranking for this team
     */
    public int getPowerRanking() {
        return ordinal();
    }

}
