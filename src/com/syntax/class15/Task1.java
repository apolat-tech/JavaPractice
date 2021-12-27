package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String mom;
        String dad;
        String child;
        String babyName;
        System.out.println("Enter Mom's First Name:");
        mom=scan.nextLine();
        System.out.println("Enter Dad's First Name:");
        dad= scan.nextLine();
        System.out.println("Is it girl or boy?");
        child= scan.nextLine();
        if(child.equals("boy")){
            babyName=dad.substring(0,3)+mom.substring(2,4);
            System.out.println("Suggested baby name:"+babyName.toUpperCase());

        }else{
            babyName=mom.substring(0,2)+dad.substring(3,6);
            System.out.println("Suggested baby name:"+babyName.toUpperCase());
        }



    }
}
