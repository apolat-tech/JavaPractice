package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		String[] words = new String[5];
		words[0] = "Java ";
		words[1] = "Saturday ";
		words[2] = "Day";
		words[3] = "coding ";
		words[4] = "is ";
		System.out.println(words[1] + words[4] + words[0] + words[3] + words[2]);

		System.out.println("*****Second Way!!!");
		String[] words2 = { "Saturday ", "is ", "Java ", "coding ", "Day" };

		for (int i = 0; i <= 4; i++)
			System.out.print(words2[i]);
	}
}
