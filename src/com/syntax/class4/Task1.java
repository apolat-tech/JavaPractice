package com.syntax.class4;

public class Task1 {

	public static void main(String[] args) {
		boolean diploma = false;
		boolean degree = true;
		float gpa = 3.4f;

		if (diploma) {
			System.out.println("Congrats!!!");
		} else if (degree) {
			if (gpa >= 3.5) {
				System.out.println("You are elligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		}
		else {
			System.out.println("Go get a degree!!");
		}

	}

}
