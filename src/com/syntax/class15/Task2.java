package com.syntax.class15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int letterCount;
        System.out.println("Enter a word:");
        word = scan.nextLine();
        letterCount = word.length();
        if (letterCount >= 3 && letterCount % 2 != 0) {
            System.out.println(word.charAt(letterCount / 2));
        }
    }
}
