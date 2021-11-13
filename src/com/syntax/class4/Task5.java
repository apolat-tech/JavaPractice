package com.syntax.class4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		System.out.println("What is the name of the city you live?");
		Scanner scan = new Scanner(System.in);
		String city = scan.next();
		System.out.println("What is the temparature?");
		double temp = scan.nextInt();
		double cel = 0;

		cel = (temp - 32) * 5 / 9;

		System.out.println("The temperature of " + city + " is " + cel);

	}

}
