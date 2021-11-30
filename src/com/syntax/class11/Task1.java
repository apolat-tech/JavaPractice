package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		int[] array = { 10, 0, 20, 8, -1, 77, 56 };
		int max = 0;

		for(int i=0;i<7;i++) {
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Max is "+max);
		
		/*
		for (int number : array) {
			for (int i = 0; i < 7; i++) {

				if (number >= array[i]) {
					max = number;
				}else {
					max=array[i];
				}

			}

			System.out.println("Max number is " + max);
		}*/

	}
}
