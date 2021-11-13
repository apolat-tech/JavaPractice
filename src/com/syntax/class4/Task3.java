package com.syntax.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("What is the loan amount do you need?");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		if (amount > 200000) {

			System.out.println("You can not get loan");

		} else
			System.out.println("You can get loan");

	}

}
