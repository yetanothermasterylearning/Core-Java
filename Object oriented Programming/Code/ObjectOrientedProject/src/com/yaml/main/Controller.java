package com.yaml.main;

import com.yaml.model.*;

public class Controller {
	public static void main(String[] args) {
		Hero hero = new Hero("NTR");
		Animal animal = new Animal();
		animal.setName("Dog");
		
		hero.defend(animal);
	}
}
