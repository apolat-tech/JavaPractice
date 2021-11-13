package com.syntax.class6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("enter number 1");
		num1 = scan.nextInt();
		System.out.println("enter number 2");
		num2 = scan.nextInt();
		System.out.println("enter operator");
		String operator = scan.next();
		int operation = 0;
		int check = 0;
		switch (operator) {
		case "+":
			operation = num1 + num2;
			break;
		case "-":
			operation = num1 - num2;
			break;
		case "*":
			operation = num1 * num2;
			break;
		case "/":
			operation = num1 / num2;
			break;
		default:
			check = 1;

		}
		if (check == 1) {
			System.out.println("Wrong operation!");
		} else {
			System.out.println(
					"You entered " + num1 + ", " + num2 + " and " + operator + " operator. Result is " + operation);
		}
	}

}
