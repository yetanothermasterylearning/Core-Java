package com.yaml.thread.example.shared;

public class Main {

	public static void main(String[] args) {
		SharedClass.n = 10;
		SharedClass.sum = 0;
		THExample t1 = new THExample();
		t1.start();
		System.out.println("Sum of "+SharedClass.n+ " numbers :"+ SharedClass.sum);
		THExample t2 = new THExample();
		t2.start();
		System.out.println("Sum of "+SharedClass.n+ " numbers :"+ SharedClass.sum);
	}

}

class SharedClass {
	static int n;
	static int sum;
}

class THExample extends Thread {
	
	public void run() {
		for (int i = 0;i<=SharedClass.n;i++) {
			SharedClass.sum += i; //[0,1,2,3,4,5,6,7,8,9,10]
			System.out.println(Thread.currentThread().getName() + " Current Sum :" +SharedClass.sum);
		}
	}
	
}
