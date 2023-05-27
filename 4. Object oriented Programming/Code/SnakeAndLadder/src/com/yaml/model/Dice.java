package com.yaml.model;

import java.util.Random;

public class Dice {
	private int maximumNumber;

	public Dice() {
		super();
		this.maximumNumber = 6;
	}
	
	public Dice(int maximumNumber) {
		super();
		this.maximumNumber = maximumNumber;
	}

	public int getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(int maximumNumber) {
		this.maximumNumber = maximumNumber;
	}
	
	public int roll() {
		Random rand = new Random();
		// Obtain a number between [0 ... (maximumNumber-1)].
		int n = rand.nextInt(maximumNumber);
		return n+1;
	}
}
