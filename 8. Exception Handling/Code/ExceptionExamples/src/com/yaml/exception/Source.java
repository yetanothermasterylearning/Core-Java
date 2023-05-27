package com.yaml.exception;

public class Source {
	public static void main(String[] args) {
		
		String st = null;
		System.out.println(st.charAt(9));
		
		int first = 23;
		int second = 0;
		int result = first/second;
		System.out.println(result);
		
		int [] a = new int[] {1,2,3,4,5};
		//read operation
		try {
			for (int i = 0; i < a.length+1; i++) {
				System.out.print(a[i]);
			}
		} catch (Exception e){
			System.out.println();
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
		}

		//read operation
		System.out.println();
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println("end");
	}
}

