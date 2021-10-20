package net.blancodev.pickem4me;

public enum NFLTeam {

    ARIZONA_CARDINALS,
    BUFFALO_BILLS,
    TAMPA_BAY_BUCCANEERS,
    DALLAS_COWBOYS,
    BALTIMORE_RAVENS,
    GREEN_BAY_PACKERS,
    LOS_ANGELES_RAMS,
    LOS_ANGELES_CHARGERS,
    KANSAS_CITY_CHIEFS,
    TENNESSEE_TITANS,
    CINCINNATI_BENGALS,
    NEW_ORLEANS_SAINTS,
    CLEVELAND_BROWNS,
    MINNESOTA_VIKINGS,
    LAS_VEGAS_RAIDERS,
    PITTSBURGH_STEELERS,
    SAN_FRANCISCO_49ERS,
    INDIANAPOLIS_COLTS,
    CAROLINA_PANTHERS,
    DENVER_BRONCOS,
    NEW_ENGLAND_PATRIOTS,
    SEATTLE_SEAHAWKS,
    CHICAGO_BEARS,
    PHILADELPHIA_EAGLES,
    ATLANTA_FALCONS,
    WASHINGTON_FOOTBALL_TEAM,
    NEW_YORK_GIANTS,
    JACKSONVILLE_JAGUARS,
    MIAMI_DOLPHINS,
    NEW_YORK_JETS,
    DETROIT_LIONS,
    HOUSTON_TEXANS;

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
