package com.yaml.model;

public class Square extends Shape {
	private double side;
	public Square() {
		super();
	}
	public Square(String color, double side) {
		super();
		this.color = color;
		this.side = side;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
