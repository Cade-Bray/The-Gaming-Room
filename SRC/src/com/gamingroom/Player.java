package com.gamingroom;

public class Player extends Entity{
	long id;
	String name;
	
	//Constructor with an identifier and name
	public Player(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}
