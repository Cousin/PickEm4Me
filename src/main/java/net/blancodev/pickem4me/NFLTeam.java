package net.blancodev.pickem4me;

public enum NFLTeam {

    KANSAS_CITY_CHIEFS,
    TAMPA_BAY_BUCCANEERS,
    SEATTLE_SEAHAWKS,
    LOS_ANGELES_RAMS,
    BUFFALO_BILLS,
    CLEVELAND_BROWNS,
    SAN_FRANCISCO_49ERS,
    PITTSBURGH_STEELERS,
    NEW_ORLEANS_SAINTS,
    BALTIMORE_RAVENS,
    GREEN_BAY_PACKERS,
    ARIZONA_CARDINALS,
    DALLAS_COWBOYS,
    LOS_ANGELES_CHARGERS,
    MIAMI_DOLPHINS,
    INDIANAPOLIS_COLTS,
    NEW_ENGLAND_PATRIOTS,
    TENNESSEE_TITANS,
    LAS_VEGAS_RAIDERS,
    DENVER_BRONCOS,
    PHILADELPHIA_EAGLES,
    WASHINGTON_FOOTBALL_TEAM,
    CAROLINA_PANTHERS,
    CINCINNATI_BENGALS,
    MINNESOTA_VIKINGS,
    CHICAGO_BEARS,
    ATLANTA_FALCONS,
    NEW_YORK_GIANTS,
    HOUSTON_TEXANS,
    DETROIT_LIONS,
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
