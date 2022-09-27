package com.yaml.model;

public class Alien extends Enemy {

	private String galaxyName;
	
	public void attack() {
		// reduce Alien power
		int energy = getEnergy();
		energy = energy-2;
		setEnergy(energy);
	}
	
	public boolean isDead() {
		int energy = getEnergy();
		boolean isAnimalEnergyIsZero = energy <= 0;
		return isAnimalEnergyIsZero;
	}
}
