package com.syntax.class11;

public class Task4_6 {

	public static void main(String[] args) {
		int[][] numbers = { { 10, 20, 30 }, { 5, 10, 15 }, { 100, 200, 300 } };
		int sum=0;
		for (int[] numArray : numbers) {
			for(int num:numArray ) {
			sum+=num;	
			}

		}
System.out.println("The sum is"+" "+sum);
	}

}
