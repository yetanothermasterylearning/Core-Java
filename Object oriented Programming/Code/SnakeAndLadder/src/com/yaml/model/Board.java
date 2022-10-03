package com.yaml.model;

public class Board {
	private int size;

	public Board() {
		super();
		this.size = 100;
	}
	
	public Board(int maximumNumber) {
		super();
		this.size = maximumNumber;
	}

	public int getMaximumNumber() {
		return size;
	}
}
