package com.syntax.class11;

public class Task4_9 {

	public static void main(String[] args) {

		// NANorthAmerica/SASouthAmerica/EUEurope/AFAfrica
		String[][] countries = { { "NA1", "NA2", "NA3" }, { "SA1", "SA2", "SA3", "SA4" },
				{ "EU1", "EU2", "EU3", "EU4", "EU5" }, { "AF1", "AF2", "AF3", "AF4", "AF5", "AF6", "AF7" } };
		int counter = 0;
		for (String[] countriesArray : countries) {
			for (String country : countriesArray) {
				System.out.println(" " + country);
				counter += 1;
			}
		}
		System.out.println("Total of " + counter + " countries");

		System.out.println("----------2nd Way----------");
		counter = 0;
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
				counter += 1;
			}
			System.out.println();
		}
		System.out.println("Total of " + counter + " countries");
	}
}
