package com.syntax.class4;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rate = 3.5f;
		int mort = 110000;

		if (rate > 4.5) {
			System.out.println("You are not buying house");
		} else if (mort > 200000) {
			System.out.println("You can take a loan");

		} else {
			System.out.println("Pay with cash");
		}
	}

}
