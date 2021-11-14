package com.syntax.class8;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int price;
		int amount = 0;
		int sum = 0;
		int dif;
		int change;
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();
		System.out.println("What is the price of the item?");
		price = scan.nextInt();
		do {
			System.out.println("Enter an amount");
			amount = scan.nextInt();
			sum += amount;
			dif = price - sum;
			if (dif < 0) {
				change = sum - price;
				System.out.println("Here is your change $" + change + " Thank you for shopping!");
				break;
			} else if (dif == 0) {
				System.out.println("Thank you for shopping!");
			} else {
				System.out.println("You still have to pay $" + dif);
			}

		} while (sum != price);

	}

}
