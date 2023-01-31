package com.yaml.runnable.example;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new TRExample("Thread-1"));
		t1.start();
		Thread t2 = new Thread(new TRExample("Thread-2"));
		t2.start();
	}

}

class TRExample implements Runnable {
	
	String name;
	
	public TRExample(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0;i<10;i++) {
			System.out.println("Name : "+name + ",i :"+i);
		}
	}
	
}
