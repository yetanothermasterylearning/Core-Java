package com.yaml.hierarchicalinterfaceinheritanceexample;

public class HierarchicalInterfaceInheritanceExample {

	public static void main(String[] args) {
		int i = 2;
		switch (i) {
		case 1:
			MonitorService monitorService = new MonitorService();
			monitorService.display();
			break;
		case 2:
			PrinterService printerService = new PrinterService();
			printerService.display();
			break;
		case 3:
			TvService tvService = new TvService();
			tvService.display();
			break;
		case 4:
			ProjectorService projectorService = new ProjectorService();
			projectorService.display();
			break;
		}
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