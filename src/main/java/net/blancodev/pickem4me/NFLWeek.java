package net.blancodev.pickem4me;

import java.util.Arrays;

/**
 * Enum containing all 17 weeks of NFL regular season and each game per week
 * Generated automatically with {@link NFLWeekParser}
 */
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
    WEEK_2(
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.NEW_ENGLAND_PATRIOTS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.DETROIT_LIONS)
    ),
    WEEK_3(
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.PHILADELPHIA_EAGLES)
    ),
    WEEK_4(
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.LAS_VEGAS_RAIDERS)
    ),
    WEEK_5(
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.NEW_ENGLAND_PATRIOTS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.INDIANAPOLIS_COLTS)
    ),
    WEEK_6(
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.BUFFALO_BILLS)
    ),
    WEEK_7(
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.NEW_ORLEANS_SAINTS)
    ),
    WEEK_8(
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.NEW_ENGLAND_PATRIOTS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.NEW_YORK_GIANTS)
    ),
    WEEK_9(
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.NEW_ENGLAND_PATRIOTS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.CHICAGO_BEARS)
    ),
    WEEK_10(
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.LOS_ANGELES_RAMS)
    ),
    WEEK_11(
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.NEW_ENGLAND_PATRIOTS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.NEW_YORK_GIANTS)
    ),
    WEEK_12(
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.SEATTLE_SEAHAWKS)
    ),
    WEEK_13(
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.NEW_ENGLAND_PATRIOTS)
    ),
    WEEK_14(
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.LOS_ANGELES_RAMS)
    ),
    WEEK_15(
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.NEW_YORK_GIANTS, NFLTeam.DALLAS_COWBOYS),
            NFLGame.of(NFLTeam.JACKSONVILLE_JAGUARS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.TENNESSEE_TITANS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.GREEN_BAY_PACKERS),
            NFLGame.of(NFLTeam.DETROIT_LIONS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.DENVER_BRONCOS, NFLTeam.CINCINNATI_BENGALS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.LOS_ANGELES_RAMS, NFLTeam.SEATTLE_SEAHAWKS),
            NFLGame.of(NFLTeam.TAMPA_BAY_BUCCANEERS, NFLTeam.NEW_ORLEANS_SAINTS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.MIAMI_DOLPHINS, NFLTeam.NEW_YORK_JETS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.CLEVELAND_BROWNS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.NEW_ENGLAND_PATRIOTS)
    ),
    WEEK_16(
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.SAN_FRANCISCO_49ERS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.CLEVELAND_BROWNS),
            NFLGame.of(NFLTeam.ARIZONA_CARDINALS, NFLTeam.INDIANAPOLIS_COLTS),
            NFLGame.of(NFLTeam.PHILADELPHIA_EAGLES, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.MINNESOTA_VIKINGS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.BUFFALO_BILLS),
            NFLGame.of(NFLTeam.CAROLINA_PANTHERS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.ATLANTA_FALCONS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.HOUSTON_TEXANS, NFLTeam.LOS_ANGELES_CHARGERS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.BALTIMORE_RAVENS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.CHICAGO_BEARS),
            NFLGame.of(NFLTeam.KANSAS_CITY_CHIEFS, NFLTeam.PITTSBURGH_STEELERS),
            NFLGame.of(NFLTeam.LAS_VEGAS_RAIDERS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.WASHINGTON_FOOTBALL_TEAM),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.MIAMI_DOLPHINS)
    ),
    WEEK_17(
            NFLGame.of(NFLTeam.WASHINGTON_FOOTBALL_TEAM, NFLTeam.PHILADELPHIA_EAGLES),
            NFLGame.of(NFLTeam.NEW_ORLEANS_SAINTS, NFLTeam.CAROLINA_PANTHERS),
            NFLGame.of(NFLTeam.NEW_YORK_JETS, NFLTeam.TAMPA_BAY_BUCCANEERS),
            NFLGame.of(NFLTeam.TENNESSEE_TITANS, NFLTeam.MIAMI_DOLPHINS),
            NFLGame.of(NFLTeam.NEW_ENGLAND_PATRIOTS, NFLTeam.JACKSONVILLE_JAGUARS),
            NFLGame.of(NFLTeam.INDIANAPOLIS_COLTS, NFLTeam.LAS_VEGAS_RAIDERS),
            NFLGame.of(NFLTeam.CINCINNATI_BENGALS, NFLTeam.KANSAS_CITY_CHIEFS),
            NFLGame.of(NFLTeam.CHICAGO_BEARS, NFLTeam.NEW_YORK_GIANTS),
            NFLGame.of(NFLTeam.BUFFALO_BILLS, NFLTeam.ATLANTA_FALCONS),
            NFLGame.of(NFLTeam.DALLAS_COWBOYS, NFLTeam.ARIZONA_CARDINALS),
            NFLGame.of(NFLTeam.SAN_FRANCISCO_49ERS, NFLTeam.HOUSTON_TEXANS),
            NFLGame.of(NFLTeam.LOS_ANGELES_CHARGERS, NFLTeam.DENVER_BRONCOS),
            NFLGame.of(NFLTeam.BALTIMORE_RAVENS, NFLTeam.LOS_ANGELES_RAMS),
            NFLGame.of(NFLTeam.SEATTLE_SEAHAWKS, NFLTeam.DETROIT_LIONS),
            NFLGame.of(NFLTeam.GREEN_BAY_PACKERS, NFLTeam.MINNESOTA_VIKINGS),
            NFLGame.of(NFLTeam.PITTSBURGH_STEELERS, NFLTeam.CLEVELAND_BROWNS)
    );

    final NFLGame[] games;

    NFLWeek(NFLGame... games) {
        this.games = games;
    }

    /**
     * Find the game for this week containing the provided team
     * @param nflTeam the team to look for
     * @return the game or null if none found
     */
    public NFLGame getGameByTeam(NFLTeam nflTeam) {
        return Arrays.stream(games).filter(g -> g.getHome() == nflTeam || g.getAway() == nflTeam).findFirst().orElse(null);
    }

    /**
     * @return the week number (1-17)
     */
    public int getWeekNumber() {
        return ordinal() + 1;
    }

    /**
     * @return array of every game for this week
     */
    public NFLGame[] getGames() {
        return games;
    }
}
