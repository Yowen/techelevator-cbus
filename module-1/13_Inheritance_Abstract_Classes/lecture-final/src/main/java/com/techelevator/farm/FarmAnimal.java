package com.techelevator.farm;

public abstract class FarmAnimal {
	private String name;
	private String sound;
	private boolean sleeping;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public boolean isSleeping() {
		return sleeping;
	}
	
	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public void sleep() {
		sleeping = true;
	}
	
	public abstract String eat();
	
	protected void kick() {
		// TDODO
	}
}