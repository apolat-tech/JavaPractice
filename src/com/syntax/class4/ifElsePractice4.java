package com.syntax.class4;

import java.util.Scanner;

public class ifElsePractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);

			System.out.println("Enter the first number:");
			int num1=scan.nextInt();
			System.out.println("Enter the second number:");
			int num2=scan.nextInt();
			System.out.println("Enter the third number:");
			int num3=scan.nextInt();

			if (num1>num2){
			  if(num1>num3){System.out.println(num1+" is the largest number");
			  }
			  else {System.out.println(num3+" is the largest");}}
			else{
			  if(num2>num3){System.out.println(num2+" is the largest");}
			  else{System.out.println(num3+ " is the largest");
			 }  
			}
			}
			
	}


