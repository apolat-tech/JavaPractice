package com.syntax.class8;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 50; i += 1) {

			if (i % 2 == 0)
				sum1 = sum1 + i;
			else {
				sum2 = sum2 + i;
			}
		}

		System.out.println("Sum of odd numbers are " + sum2);
		System.out.println("Sum of even numbers are " + sum1);

	}

}
