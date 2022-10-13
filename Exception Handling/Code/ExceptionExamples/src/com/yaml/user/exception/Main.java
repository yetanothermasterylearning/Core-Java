package com.yaml.user.exception;

public class Main {

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (WrongInputException wie) {
			wie.printStackTrace();
		} catch (RuntimeException rtx) {
			rtx.printStackTrace();
		}
	}

	static void validate(int a) {
		if (a < 21) {
			throw new WrongInputException("Under age to buy breverages");
		} else {
			System.out.println("Please go and buy");
		}
	}
}
