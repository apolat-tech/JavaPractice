package com.syntax.class11;

import java.util.Scanner;

public class Task4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number and i will tell whether it is prime or not");
		int n = scan.nextInt();
		double limit = Math.sqrt(n);
		int j = 0;
		for (int i = 2; i < limit; i++) {

			if (n % i == 0) {
				System.out.println("This number is not a prime number");
				j = 1;
				break;

			}
		}
		if (j == 0) {
			System.out.println("This number is a prime number");
		}

	}

}
