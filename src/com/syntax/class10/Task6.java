package com.syntax.class10;

public class Task6 {

	public static void main(String[] args) {
		String[] countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Turkiye";
		countries[2] = "Germany";

		for (String country : countries) {

			switch (country) {

			case "USA":
				System.out.println("The capital of " + country + " is Washington");
				break;
			case "Turkiye":
				System.out.println("The capital of " + country + " is Ankara");
				break;
			case "Germany":
				System.out.println("The capital of " + country + " is Berlin");
				break;
			}

		}

		System.out.println("-----2nd Loop");

		for (int i = 0; i < countries.length; i++) {

			if (countries[i] == "USA")
				System.out.println("The capital of " + countries[i] + " is Washington");
			else if (countries[i] == "Turkiye")
				System.out.println("The capital of " + countries[i] + " is Ankara");
			else if (countries[i] == "Germany")
				System.out.println("The capital of " + countries[i] + " is Berlin");

		}
	}

}
