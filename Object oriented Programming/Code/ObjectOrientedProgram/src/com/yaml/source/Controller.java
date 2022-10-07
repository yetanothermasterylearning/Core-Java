package com.yaml.source;

import com.yaml.model.*;
import com.yaml.service.AreaService;
import com.yaml.service.AreaServiceImpl;
import com.yaml.service.AreaServiceImpl2;

public class Controller {

	public static void main(String[] args) {
		
		Shape shape = new Circle("Red", 3);
		AreaService areaService = new AreaServiceImpl();
		double circleArea = areaService.area(shape);
		System.out.println("Circle Area : "+ circleArea);
		
		shape = new Square("Green", 3);
		areaService = new AreaServiceImpl2();
		double squareArea = areaService.area(shape);
		System.out.println("Square Area : "+ squareArea);
	}

}
