package com.syntax.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		double salary;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many years have you been working?");
		year = scan.nextInt();
		System.out.println("What is your annual salary?");
		salary = scan.nextDouble();

		if (year >= 5) {
			System.out.println("You are elligle for the bonus!");
			if (salary >= 50000) {
				System.out.println("Bonus amount is $5000");
			} else {
				System.out.println("Bonus amount is $3000");
			}

		} else {
			System.out.println("You are not eligble for the bonus.");
		}

	}

}
