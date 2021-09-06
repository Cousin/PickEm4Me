package net.blancodev.pickem4me;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class NFLWeekParser {

    public static void main(String[] args) throws Exception {

        for (String line : Files.readAllLines(new File("week.txt").toPath())) {

            if (line.contains("nfl-c-matchup-strip__left-area")) {

                String[] teamsSplit = line.split(" vs ");

                String homeStr = teamsSplit[0].split("aria-label=\"")[1];
                String awayStr = teamsSplit[1].split(" ")[0];

                System.out.println("NFLGame.of(NFLTeam." + getTeamByCloseName(homeStr).name() + ", NFLTeam." + getTeamByCloseName(awayStr).name() + "),");

            }

        }

    }

    private static NFLTeam getTeamByCloseName(String name) {

        return Arrays.stream(NFLTeam.values())
                .filter(t -> t.name().contains(name.toUpperCase()))
                .findFirst()
                .orElse(null);

    }

}
