package com.syntax.class4;

import java.util.Scanner;

public class IfElsePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);

System.out.println("Is it sunny outside True/False");
boolean isSunny =scan.nextBoolean();

if(isSunny){
System.out.println("It is a sunny day, I should go somewhere!");

}else{

System.out.println("I should stay home");
}
	}

}
