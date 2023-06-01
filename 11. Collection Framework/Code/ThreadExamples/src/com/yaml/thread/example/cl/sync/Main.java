package com.yaml.thread.example.cl.sync;

public class Main {

	public static void main(String[] args) {
		THExample t1 = new THExample("Thread-1");
		t1.start();
		THExample t2 = new THExample("Thread-2");
		t2.start();
	}

}

class DisplayService {
	
	public synchronized static void greeting(String name) {
		for (int i = 0;i<10;i++) {
			System.out.println("Name: "+name + ", i:"+i);
		}
	}
}

class THExample extends Thread {
	String name;
	
	THExample(String name) {
		this.name = name;
	}
	
	public void run() {
		DisplayService.greeting(name);
	}
	
}
