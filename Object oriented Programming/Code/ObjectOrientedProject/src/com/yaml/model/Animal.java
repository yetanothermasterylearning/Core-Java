package com.yaml.model;

public class Animal extends Enemy {

	public void attack() {
		// reduce animal power
		int energy = getEnergy();
		energy--;
		setEnergy(energy);
	}
	
	public boolean isDead() {
		int energy = getEnergy();
		boolean isAnimalEnergyIsZero = energy <= 0;
		return isAnimalEnergyIsZero;
	}
		
}
