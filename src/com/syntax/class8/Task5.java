package com.syntax.class8;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 50; i += 2) {
			sum = sum + i;
		}

		System.out.println("Sum of odd numbers are " + sum);
		
		
		sum = 0;
		for (int j = 0; j <= 50; j += 2) {
			sum = sum + j;
		}

		System.out.println("Sum of even numbers are " + sum);
	}

}
