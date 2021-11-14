package com.syntax.class8;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int start=0;
		int finish=0;
		int sum1 = 0;
		int sum2 = 0;

		System.out.println("What is the start of the range?");
		start = scan.nextInt();

		System.out.println("What is the finish of the range?");
		finish = scan.nextInt();

		for (int i = start; i <= finish; i++) {

			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println("sum of the even numbers between " + start + " and " + finish + " is " + sum1);
		System.out.println("sum of the odd numbers between " + start + " and " + finish + " is " + sum2);

	}
}
