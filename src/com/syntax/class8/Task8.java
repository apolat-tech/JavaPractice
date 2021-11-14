package com.syntax.class8;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer="No";

		while (!answer.equalsIgnoreCase("Yes")) {
			System.out.println("Are you goint to apply for the credit card?");
			answer = scan.nextLine();
		}

		System.out.println("Thank you for applying!");
	}
}
