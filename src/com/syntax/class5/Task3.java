package com.syntax.class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("What is today in number format 1-7?");
int day = scan.nextInt();
if (day>0 && day<6) {
	System.out.println("Weekday");
}else if (day>5 && day<8) {
	System.out.println("Weekend");
}else {
System.out.println("Enter valid number!");
	}
	}
}
