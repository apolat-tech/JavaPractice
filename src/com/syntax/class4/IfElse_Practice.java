package com.syntax.class4;
import java.util.Scanner;
public class IfElse_Practice {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();
	  	System.out.println("Your name is "+name);
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	if (name.equals("Chen")){
	      System.out.println("teacher");
	    }
	    else{
	      System.out.println("student");
	    }
	  }

	}



