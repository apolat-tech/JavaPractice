package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		String[][] array = { { "Mr.", "Mrs.", "Ms.", "Miss." }, { "Smith", "Jordan", "Jackson", "Obama" } };

		// {"Mrs.Smith","Mr.Obama","Ms.Jackson","Miss Jordan"}
		System.out.println(array[0][1] +  array[1][0]);
		System.out.println(array[0][0] +  array[1][3]);
		System.out.println(array[0][2] +  array[1][2]);
		System.out.println(array[0][3] +  array[1][1]);
		
	}
}
