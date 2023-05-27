package com.yaml.thread.example.fn.sync;

public class Main {

	public static void main(String[] args) {
		DisplayService displayService = new DisplayService();
		THExample t1 = new THExample(displayService, "Thread-1");
		t1.start();
		THExample t2 = new THExample(displayService, "Thread-2");
		t2.start();
	}
}

class DisplayService {
	
	public synchronized void greeting(String name) {
		for (int i = 0;i<10;i++) {
			System.out.println("Name: "+name + ", i:"+i);
		}
	}
}

class THExample extends Thread {
	DisplayService displayService;
	String name;
	
	THExample(DisplayService displayService, String name) {
		this.displayService = displayService;
		this.name = name;
	}
	
	public void run() {
		displayService.greeting(name);
	}
	
}
