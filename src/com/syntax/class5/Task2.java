package com.syntax.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("What is your height?");
int height =scan.nextInt();
if (height<60) {
	System.out.println("short");
}else if(height>60 && height<72) {
	System.out.println("medium");
}else if (height>72) {
	System.out.println("tall");
}

	}

}
