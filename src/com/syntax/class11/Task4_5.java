package com.syntax.class11;

public class Task4_5 {

	public static void main(String[] args) {
		int[] numbers = { -10, -20, 3, 14, -50 };
		int max = numbers[0];
		int max2 = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];

		}
		System.out.println("Max is " + max);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max2)
				if (numbers[i] == max) {
					continue;
				} else {
					max2 = numbers[i];
				}

		}
		System.out.println("2nd largest is " + max2);

	}

}
