package com.yaml.model;

public class Hero { // extends Object
	
	private String name;
	private int energy;
	
	public Hero() {
		super();
	}

	public Hero(String name) {
		super();
		this.name = name;
		this.energy = 100;
	}
	
	public Hero(String name, int energy) {
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
	
	public void defend(Animal animal) {//pass Enemy and use instance of
		// reduce animal power
		int energy = animal.getEnergy();
		energy = energy-5;
		animal.setEnergy(energy);
		if (animal.isDead()) {
			System.out.println("Congrats!! you killed the "+ animal.getName() + " and got 25 points");
			this.energy = this.energy + 25; 
		}
	}
	
	public void defend(Alien alien) {
		// reduce animal power
		int energy = alien.getEnergy();
		energy = energy-10;
		alien.setEnergy(energy);
		if (alien.isDead()) {
			System.out.println("Congrats!! you killed the "+ alien.getName()+ " and got 100 points");
			this.energy = this.energy + 100; 
		}
	}
	
	public boolean isDead() {
		int energy = getEnergy();
		boolean isAnimalEnergyIsZero = energy <= 0;
		return isAnimalEnergyIsZero;
	}
}
