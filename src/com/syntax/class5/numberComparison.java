package com.syntax.class5;

import java.util.Scanner;

public class numberComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		System.out.println("Enter 3 numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		double largest=0;
		//System.out.println("the numbers that are entered are " + num1 + " " + num2 + " " + num3);
		
		if (num1>num2 && num1>num3)
			largest=num1;
		else if (num2>num1 && num2>num3)
			largest=num2;
		else
			largest=num3;
			
		System.out.println("The largest number is "+largest);
	}

}
