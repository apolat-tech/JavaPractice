package com.syntax.class15;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String reverse="";
        System.out.println("Enter a word");
        word = scan.nextLine();
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i) + " ");
            reverse+=word.charAt(i);

        }
        System.out.println();
        System.out.println(reverse);
        if(word.equals(reverse)){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("this is not a palindrome");
        }
    }
}
