package com.syntax.class6;

import java.util.Scanner;

public class Lang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String country;
		String lang;
		System.out.println("Enter a country!");
		country = scan.nextLine();

		switch (country.toUpperCase()) {

		case "USA":
			lang = "English";
			break;
		case "FRANCE":
			lang = "French";
			break;
		case "SPAIN":
			lang = "Spanish";
			break;
		default:
			lang = "Enter a valid country!";

		}
		if (lang.equals("Enter a valid country!"))
			System.out.println(lang);
		else
			System.out.println(country + " speaks " + lang + ".");

	}

}
