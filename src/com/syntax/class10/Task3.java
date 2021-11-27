package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {

		String[] cars = new String[6];
		cars[0] = "car1";
		cars[1] = "car2";
		cars[2] = "car3";
		cars[3] = "car4";
		cars[4] = "car5";
		cars[5] = "car6";

		for (int i = 0; i < cars.length; i++)

			System.out.println(cars[i] + " ");

	int[] numbers=new int[3];
	numbers[0]=3;
	numbers[1]=4;
	numbers[2]=5;
	int total=0;
	
	total=numbers[0]+numbers[1]+numbers[2];
	System.out.println("Total is "+total);
		
	}

}
