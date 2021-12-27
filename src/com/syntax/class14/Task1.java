package com.syntax.class14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String username="";
        String password="";
        String password2="";
        System.out.println("enter your username");
        username=scan.next();
        System.out.println("enter your password");
        password= scan.next();
        System.out.println("enter your password one more time");
        password2=scan.next();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password can not be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(username)){
            System.out.println("Password can not contain username");
        }else if(!(password.equals(password2))){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
