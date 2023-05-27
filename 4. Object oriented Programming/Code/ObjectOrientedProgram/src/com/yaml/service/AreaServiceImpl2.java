package com.yaml.service;

import com.yaml.model.Circle;
import com.yaml.model.Shape;
import com.yaml.model.Square;

public class AreaServiceImpl2 implements AreaService {

	public double area(Shape shape) {
		if (shape instanceof Circle) {
			Circle circle = (Circle)shape;
			return Math.PI * circle.getRadius() * circle.getRadius();
		} else if (shape instanceof Square) {
			Square square = (Square)shape;
			return Math.pow(square.getSide(),2);
		}
		return 0;
	}

}
