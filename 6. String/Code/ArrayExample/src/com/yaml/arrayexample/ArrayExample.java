package com.yaml.arrayexample;

public class ArrayExample {

	public static void main(String[] args) {
		int intData = 23;
		System.out.println("intData :"+intData);

		int[] intArray = new int[5];
		//System.out.println("intArray :"+intArray);

		double[] doubleArray = new double[] {2.0, 3.0, 5.6};

		// write operation
		for (int index = 0;index < intArray.length; index++) {
			intArray[index] = index;
		}

		// read operation
		for (int index = 0;index < intArray.length; index++) {
			System.out.println(intArray[index]);
		}

		// read operation
		for (int index = 0;index < doubleArray.length; index++) {
			System.out.println(doubleArray[index]);
		}

		Object[] objetArray = new Object[3];
		for (int index = 0;index < objetArray.length; index++) {
			System.out.println(objetArray[index]);
		}
	}

}
