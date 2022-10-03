package com.yaml.model;

public abstract class Enemy {
	
	private String name;
	private int energy;
	
	public Enemy() {
		super();
	}

	public Enemy(String name) {
		super();
		this.name = name;
		this.energy = 100;
	}
	
	public Enemy(String name, int energy) {
		super();
		this.name = name;
		this.energy = energy;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	// Functionality
	public abstract void attack(Hero hero);
	
	//Implementation
	public boolean isDead() {
		int energy = getEnergy();
		boolean isAnimalEnergyIsZero = energy <= 0;
		return isAnimalEnergyIsZero;
	}
}
