package com.yaml.runtimeobjectreferenceexample;

public class RuntimeObjectReferenceExample {

	public static void main(String[] args) {
		int i = 2;
		//Advance - Parent variable can reference/point child object(memory)
		DisplayService displayService = null;
		
		switch (i) {
		case 1:
			displayService = new MonitorService();
			break;
		case 2:
			displayService = new PrinterService();
			break;
		case 3:
			displayService = new TvService();
			break;
		case 4:
			displayService = new ProjectorService();
			break;
		}
		displayService.display();
	}

}

interface DisplayService {
	public void display();
}

class PrinterService implements DisplayService {
	public void display() {
		System.out.println("check printer - print the page");
	}
}

class MonitorService implements DisplayService {
	public void display() {
		System.out.println("check monitor - extend the display");
	}
}

class TvService implements DisplayService {
	public void display() {
		System.out.println("check tv connection - mirror the display");
	}
}

class ProjectorService implements DisplayService {
	public void display() {
		System.out.println("check projector connection - extend the display");
	}
}