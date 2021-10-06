package net.blancodev.pickem4me;

public enum NFLTeam {

    BUFFALO_BILLS,
    ARIZONA_CARDINALS,
    LOS_ANGELES_RAMS,
    TAMPA_BAY_BUCCANEERS,
    GREEN_BAY_PACKERS,
    CLEVELAND_BROWNS,
    BALTIMORE_RAVENS,
    DALLAS_COWBOYS,
    LOS_ANGELES_CHARGERS,
    LAS_VEGAS_RAIDERS,
    KANSAS_CITY_CHIEFS,
    CAROLINA_PANTHERS,
    SEATTLE_SEAHAWKS,
    DENVER_BRONCOS,
    SAN_FRANCISCO_49ERS,
    CINCINNATI_BENGALS,
    NEW_ORLEANS_SAINTS,
    TENNESSEE_TITANS,
    WASHINGTON_FOOTBALL_TEAM,
    NEW_ENGLAND_PATRIOTS,
    INDIANAPOLIS_COLTS,
    MINNESOTA_VIKINGS,
    CHICAGO_BEARS,
    PITTSBURGH_STEELERS,
    PHILADELPHIA_EAGLES,
    MIAMI_DOLPHINS,
    ATLANTA_FALCONS,
    NEW_YORK_GIANTS,
    NEW_YORK_JETS,
    HOUSTON_TEXANS,
    DETROIT_LIONS,
    JACKSONVILLE_JAGUARS;

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
