package com.yaml.model;

public class Animal extends Enemy {

	public void attack(Hero hero) {
		// reduce hero power
		int energy = hero.getEnergy();
		energy--;
		hero.setEnergy(energy);
	}
		
}
