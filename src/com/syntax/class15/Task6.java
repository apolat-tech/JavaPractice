package com.syntax.class15;

public class Task6 {
    public static void main(String[] args) {
        String a = "Is it Saturday? Is it raining? Do we have a Java class today?";
        String[] b = a.split("\\?");
        int counter=0;
        for (String c : b) {
            System.out.println(c);
            counter++;
        }
        System.out.println(counter);
    }

}
