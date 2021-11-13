package com.syntax.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entere a grade!");
		Scanner scan = new Scanner(System.in);
		String grade = scan.next();
		String message;
		switch (grade.toLowerCase()) {
		case "a":
			message = "Excelent";
			break;
		case "b":
			message = "Good";
			break;
		case "c":
			message = "Average";
			break;
		case "d":
			message = "Bad";
			break;
		default:
			message = "Not Acceptable!";

		}
		System.out.println(message);
	}

}
