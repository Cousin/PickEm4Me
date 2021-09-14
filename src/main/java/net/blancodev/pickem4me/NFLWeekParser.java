package net.blancodev.pickem4me;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;

/**
 * Generates {@link NFLWeek} enum based on NFL API data
 */
public class NFLWeekParser {

    public static void main(String[] args) {

        for (int i = 1; i <= 17; i++) {

            final JSONObject weekData = getWeekData(i);

            final JSONArray games = weekData.getJSONArray("games");

            System.out.println("WEEK_" + i + "(");

            for (Object game : games) {

                JSONObject gameObject = new JSONObject(String.valueOf(game));

                JSONObject homeObject = gameObject.getJSONObject("homeTeam");
                JSONObject awayObject = gameObject.getJSONObject("awayTeam");

                System.out.println("\t\tNFLGame.of(NFLTeam." + getTeamByCloseName(homeObject.getString("nickName")).name() + ", NFLTeam." + getTeamByCloseName(awayObject.getString("nickName")).name() + "),");

            }

            System.out.println("),");

        }

    }

    private static JSONObject getWeekData(int week) {

        final ConnectionBuilder connectionBuilder = new ConnectionBuilder("https://api.nfl.com/experience/v1/games?season=2021&seasonType=REG&week=" + week)
                .https(true)
                .method(ConnectionBuilder.ConnectionMethod.GET)
                .header("Authorization", "Bearer <redacted>")
                .send();

        return new JSONObject(connectionBuilder.getResponse());

    }

    private static NFLTeam getTeamByCloseName(String name) {

        return Arrays.stream(NFLTeam.values())
                .filter(t -> t.name().contains(name.toUpperCase().replace(" ", "_")))
                .findFirst()
                .orElse(null);

    }

}
