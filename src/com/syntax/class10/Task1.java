package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println("Grade is "+grade[1]);
		
		System.out.println("*****Second Way!!!");
		char[] grade2 = {'A','B','C','D','E','F'};
		System.out.println("Grade is "+grade2[1]);
		
	}

}
