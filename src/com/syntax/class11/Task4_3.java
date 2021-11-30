package com.syntax.class11;

public class Task4_3 {

	public static void main(String[] args) {
		// Fibonacci Series-First 10 numbers
		System.out.println("Here is the first 10 numbers of Fibonaci");
		int numA = 0;
		int numB = 1;
		int numC=0;
		/*
		 * int numC=numA+numB; numA=numB; numB=numC; numC=numA+numB;
		 */

		for (int i = 0; i < 10; i++) {
			//numC=numA+numB; 
			numC=numA+numB;
			numA=numB; 
			numB=numC; 
			
			System.out.println(numC+" ");

		}
	}

}
