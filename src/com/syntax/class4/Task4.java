package com.syntax.class4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		System.out.println("what is your age?");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if (age < 18) {
			System.out.println("You can get permit");
		} else {
			System.out.println("You can get driver license");
		}

	}

}
