package com.syntax.class11;

public class Task4_1 {

	public static void main(String[] args) {
		String a = "Veli";
		String b = "Ali";
		System.out.println("Before swap " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After swap " + a + " " + b);

	}

}
