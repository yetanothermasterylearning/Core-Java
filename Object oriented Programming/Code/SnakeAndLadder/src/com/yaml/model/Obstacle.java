package com.yaml.model;

public abstract class Obstacle {
	private int startingPosition;
	private int endingPosition;
	
	
	public Obstacle(int startingPosition, int endingPosition) {
		super();
		this.startingPosition = startingPosition;
		this.endingPosition = endingPosition;
	}

	public int getStartingPosition() {
		return startingPosition;
	}
	
	public void setStartingPosition(int startingPosition) {
		this.startingPosition = startingPosition;
	}
	
	public int getEndingPosition() {
		return endingPosition;
	}
	
	public void setEndingPosition(int endingPosition) {
		this.endingPosition = endingPosition;
	}
}
