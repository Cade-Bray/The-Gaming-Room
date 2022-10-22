package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {
	long id;
	String name;
	
	//A list of the active teams
	private List<Team> teams = new ArrayList<Team>();
	
	//Hide the default constructor to prevent creating empty instances.
	private Game() {
	}

	//Constructor with an identifier and name
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		// This loop will iterate through the teams in the list "teams". If it finds a match it will assign it team.
		for (Team t : teams) {
			if (t.getName() == name) {
				team = t;
			}
		}

		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(this.id++, this.name);
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;
	}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
