package com.syntax.class11;

public class Task4_4 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 3, 140, 50 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("Max is " + max);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}
		System.out.println("Min is " + min);
	}
}