package com.syntax.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean sale=true;
Scanner scan = new Scanner(System.in);
System.out.println("is store has sale? true/false?");
sale=scan.nextBoolean();
double price=0;

if (sale) {
	System.out.println("What is the price?");
	price=scan.nextDouble();
	if (price<50)
	{price=price*0.9;}
	else if(price>50 && price<100) 
	{price=price*0.8; }
	else if (price>100 && price<500)
	{price=price*0.6;}
	else if (price>500)
	{price=price*0.5;}
	
	System.out.println("Price of the product is $"+price);
}
else
	{System.out.println("Sorry no sales!");}

}
}
