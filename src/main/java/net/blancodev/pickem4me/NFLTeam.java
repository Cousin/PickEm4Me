package net.blancodev.pickem4me;

public enum NFLTeam {

    TAMPA_BAY_BUCCANEERS,
    KANSAS_CITY_CHIEFS,
    BALTIMORE_RAVENS,
    LOS_ANGELES_RAMS,
    BUFFALO_BILLS,
    GREEN_BAY_PACKERS,
    SAN_FRANCISCO_49ERS,
    CLEVELAND_BROWNS,
    SEATTLE_SEAHAWKS,
    ARIZONA_CARDINALS,
    LAS_VEGAS_RAIDERS,
    PITTSBURGH_STEELERS,
    DENVER_BRONCOS,
    LOS_ANGELES_CHARGERS,
    NEW_ENGLAND_PATRIOTS,
    TENNESSEE_TITANS,
    DALLAS_COWBOYS,
    CAROLINA_PANTHERS,
    NEW_ORLEANS_SAINTS,
    PHILADELPHIA_EAGLES,
    WASHINGTON_FOOTBALL_TEAM,
    MIAMI_DOLPHINS,
    INDIANAPOLIS_COLTS,
    MINNESOTA_VIKINGS,
    CHICAGO_BEARS,
    CINCINNATI_BENGALS,
    NEW_YORK_GIANTS,
    HOUSTON_TEXANS,
    ATLANTA_FALCONS,
    NEW_YORK_JETS,
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
