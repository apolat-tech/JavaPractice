package com.syntax.class10;

public class Task4 {

	public static void main(String[] args) {
		String[] animals=new String[6];
		animals[0]="Animal1";
		animals[1]="Animal2";
		animals[2]="Animal3";
		animals[3]="Animal4";
		animals[4]="Animal5";
		animals[5]="Animal6";
		
		
		for(String animal:animals) {
			System.out.println(animal+" ");
		}
		
		System.out.println("----Second Loop");
		
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]+" ");
		}
	}

}
