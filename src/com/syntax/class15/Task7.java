package com.syntax.class15;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sent;
        System.out.println("Enter a sentences");
        sent = scan.nextLine();
        String[] word = sent.split(" ");

        for (int i = 0; i <= word.length - 1; i++) {
            for (int j = word[i].length() - 1; j >= 0; j--) {
                System.out.print(word[i].charAt(j) + " ");
            }

            System.out.print(" ");
        }
        //System.out.print(word.charAt(i) + " ");

    }
}
