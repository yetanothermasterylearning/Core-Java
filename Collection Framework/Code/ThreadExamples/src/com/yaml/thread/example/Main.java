package com.yaml.thread.example;

public class Main {

	public static void main(String[] args) {
		THExample t1 = new THExample();
		t1.start();
		THExample t2 = new THExample();
		t2.start();
	}

}

class THExample extends Thread {
	
	public void run() {
		for (int i = 0;i<10;i++) {
			System.out.println("Name : "+Thread.currentThread().getName() + ",i :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
