package com.yaml.model;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		super();
	}
	public Circle(String color, double radius) {
		super();
		this.color = color;
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
