package com.syntax.class7;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean workDay = true;
		int day = 1;

		while (workDay) {

			if (day < 6) {
				System.out.println("I need a day off!");
				day++;
			} else {
				System.out.println("I dont need a day off anymore");
				workDay = false;	
			}

		}
	

	}
}
