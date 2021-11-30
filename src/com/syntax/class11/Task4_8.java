package com.syntax.class11;

public class Task4_8 {

	public static void main(String[] args) {
		int[][] numbers = { { 10, 20, 30, 41 }, { 5, 10, 15, 21 }, { 100, 200, 300, 401 } };
		int sum=0;
		for (int[] numArray : numbers) {
			for(int num:numArray ) {
				if(num%2!=0) {
					sum+=num;
					
					
				}
			}

		}
		System.out.println("The sum of all odd numbers is "+sum);


	}

}
