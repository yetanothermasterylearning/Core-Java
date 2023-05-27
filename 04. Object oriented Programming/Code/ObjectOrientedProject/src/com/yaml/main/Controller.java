package com.yaml.main;

import com.yaml.model.*;

public class Controller {
	public static void main(String[] args) {
		Hero hero = new Hero("NTR");
		Animal animal = new Animal();
		animal.setName("Dog");
		
		
		int joyStickOption = 2;
		switch (joyStickOption) {
		case 1:
			animal.attack(hero);
			break;
		case 2:
			hero.defend(animal);
			break;
		}
		if (hero.isDead()) {
			System.out.println("Winner - Animal");
		}
		if (animal.isDead()) {
			System.out.println("Winner - Hero");
		}
		
	}
}
