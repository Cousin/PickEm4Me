package net.blancodev.pickem4me;

public enum NFLTeam {

    LOS_ANGELES_RAMS,
    TAMPA_BAY_BUCCANEERS,
    GREEN_BAY_PACKERS,
    BUFFALO_BILLS,
    BALTIMORE_RAVENS,
    KANSAS_CITY_CHIEFS,
    SAN_FRANCISCO_49ERS,
    CLEVELAND_BROWNS,
    LAS_VEGAS_RAIDERS,
    LOS_ANGELES_CHARGERS,
    ARIZONA_CARDINALS,
    DENVER_BRONCOS,
    CAROLINA_PANTHERS,
    DALLAS_COWBOYS,
    TENNESSEE_TITANS,
    MINNESOTA_VIKINGS,
    SEATTLE_SEAHAWKS,
    NEW_ORLEANS_SAINTS,
    CINCINNATI_BENGALS,
    PITTSBURGH_STEELERS,
    MIAMI_DOLPHINS,
    PHILADELPHIA_EAGLES,
    NEW_ENGLAND_PATRIOTS,
    WASHINGTON_FOOTBALL_TEAM,
    ATLANTA_FALCONS,
    INDIANAPOLIS_COLTS,
    DETROIT_LIONS,
    HOUSTON_TEXANS,
    CHICAGO_BEARS,
    NEW_YORK_GIANTS,
    JACKSONVILLE_JAGUARS,
    NEW_YORK_JETS;

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
