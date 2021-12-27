package com.syntax.class15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
        word = scan.nextLine();
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i) + " ");
        }
    }
}
