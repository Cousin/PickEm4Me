package net.blancodev.pickem4me;

public enum NFLTeam {

    BUFFALO_BILLS,
    ARIZONA_CARDINALS,
    TAMPA_BAY_BUCCANEERS,
    DALLAS_COWBOYS,
    LOS_ANGELES_CHARGERS,
    GREEN_BAY_PACKERS,
    BALTIMORE_RAVENS,
    LOS_ANGELES_RAMS,
    CLEVELAND_BROWNS,
    KANSAS_CITY_CHIEFS,
    NEW_ORLEANS_SAINTS,
    TENNESSEE_TITANS,
    CINCINNATI_BENGALS,
    CAROLINA_PANTHERS,
    MINNESOTA_VIKINGS,
    PITTSBURGH_STEELERS,
    SAN_FRANCISCO_49ERS,
    LAS_VEGAS_RAIDERS,
    DENVER_BRONCOS,
    PHILADELPHIA_EAGLES,
    SEATTLE_SEAHAWKS,
    NEW_ENGLAND_PATRIOTS,
    CHICAGO_BEARS,
    INDIANAPOLIS_COLTS,
    ATLANTA_FALCONS,
    WASHINGTON_FOOTBALL_TEAM,
    NEW_YORK_GIANTS,
    MIAMI_DOLPHINS,
    DETROIT_LIONS,
    HOUSTON_TEXANS,
    NEW_YORK_JETS,
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
