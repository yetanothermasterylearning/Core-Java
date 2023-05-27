package com.yaml.model;

public class Alien extends Enemy {

	private String galaxyName;

	public void attack(Hero hero) {
		// reduce hero power
		int energy = hero.getEnergy();
		energy = energy-2;
		hero.setEnergy(energy);
	}

}
