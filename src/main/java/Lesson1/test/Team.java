package Lesson1.test;

public class Team {
    String teamName;
    Players [] players;

    public String getTeamName() {
        return teamName;
    }

    public Players[] getPlayers() {
        return players;
    }

    public Team(String teamName, Players[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }
}
