package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

public class Team extends Entity{
	long id;
	String name;
	
	//A list of the active teams
	private List<Player> players = new ArrayList<Player>();
	
	//Constructor with an identifier and name
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Player addPlayer(String name) {

		// a local player instance
		Player player = null;

		// This loop will iterate through the players in the list "players".
		// If it finds a match it will assign it player.
		for (Player p : players) {
			if (p.getName() == name) {
				player = p;
			}
		}

		// if not found, make a new player instance and add to list of players
		if (player == null) {
			player = new Player(this.id++, this.name);
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
