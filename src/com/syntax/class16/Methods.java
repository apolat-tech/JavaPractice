package com.syntax.class16;

import java.util.Scanner;

public class Methods {
    public static void findMax(double num1, double num2) {

        if (num1 > num2) {
            System.out.println((num1 + " is greater than " + num2));
        } else if (num2 > num1) {
            System.out.println((num2 + " is greater than " + num1));
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");

        }
    }

    public static void evenOdd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = scan.nextDouble();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void palindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something");
        String phrase = scan.nextLine();
        String phrase2 = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            phrase2 += phrase.charAt(i);
        }
        if (phrase.equalsIgnoreCase(phrase2)) {
            System.out.println("This phrase is palindrome");
        } else {
            System.out.println("This is phrase is not palindrome");
        }
    }

    public static void hello() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a country");
        String country = scan.nextLine();
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "England":
                System.out.println("Hello ");
                break;
            default:
                System.out.println("Not valid!");
        }
    }

    public static void createEmail(String name, String lastName, String emailType) {
        System.out.println(name + lastName + "@" + emailType + ".com");
    }

    public static void isItPrime(int number) {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter += 1;
            }

        }
        if (counter == 0) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }


    }

    public static StringBuilder getGrade(int score) {
         StringBuilder grade = new StringBuilder("");
        if (score > 90) {
            grade = new StringBuilder("A");
        } else if (score > 80) {
            grade = new StringBuilder("B");
        } else if (score > 70) {
            grade = new StringBuilder("C");
        } else if (score > 50) {
            grade = new StringBuilder("D");
        } else {
            grade = new StringBuilder("F");
        }
        System.out.println(grade);
        return grade;
    }
}

