package com.mai.airwi.bestnbaapp;
import java.util.*;

/**
 * Created by hans on 4/17/20.
 */

public class Team {
    //["00","1610612747","1948","2019","LAL","Lakers","1948","Los Angeles","Staples Center",
    // "19060","Jerry Buss Family Trust","Rob Pelinka","Frank Vogel","South Bay Lakers"]

    int teamID, minYear, maxYear, yearFounded, arenaCapacity;
    String leagueID, abbr, nickname, city, arena, owner, genManager, headCoach, DLeagueAffiliate;

    public Team(String leagueID, String teamID, String minYear, String maxYear, String abbr,
                String nickname, String yearFounded, String city, String arena,
                String arenaCapacity, String owner, String genManager, String headCoach, String DLeagueAffiliate) {

        this.leagueID = leagueID;
        this.teamID = Integer.parseInt(teamID);
        this.minYear = Integer.parseInt(minYear);
        this.maxYear = Integer.parseInt(maxYear);
        this.yearFounded = Integer.parseInt(yearFounded);
        this.arenaCapacity = Integer.parseInt(arenaCapacity);

        this.abbr = abbr;
        this.nickname = nickname;
        this.city = city;
        this.arena = arena;
        this.owner = owner;
        this.genManager = genManager;
        this.headCoach = headCoach;
        this.DLeagueAffiliate = DLeagueAffiliate;
    }

    public Team(List<String> set) {

        this.leagueID = set.get(0);

        this.teamID = Integer.parseInt(set.get(1));
        this.minYear = Integer.parseInt(set.get(2));
        this.maxYear = Integer.parseInt(set.get(3));

        this.abbr = set.get(4);
        this.nickname = set.get(5);

        this.yearFounded = Integer.parseInt(set.get(6));

        this.city = set.get(7);
        this.arena = set.get(8);

        this.arenaCapacity = Integer.parseInt(set.get(9));

        this.owner = set.get(10);
        this.genManager = set.get(11);
        this.headCoach = set.get(12);
        this.DLeagueAffiliate = set.get(13);
    }

    public String getLeagueID() {
        return this.leagueID;
    }

    public int getTeamID() {
        return this.teamID;
    }

    public int getMinYear() {
        return this.minYear;
    }

    public int getMaxYear() {
        return this.maxYear;
    }

    public int getYearFounded() {
        return this.yearFounded;
    }

    public int getArenaCapacity() {
        return this.arenaCapacity;
    }

    public String getAbbr() {
        return this.abbr;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getCity() {
        return this.city;
    }

    public String getArena() {
        return this.arena;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getGenManager(){
        return this.genManager;
    }

    public String getHeadCoach() {
        return this.headCoach;
    }

    public String getDLeagueAffiliate() {
        return this.DLeagueAffiliate;
    }
}
