package com.syntax.class15;

public class Task9 {
    public static void main(String[] args) {
        String a="oldu be";
        String b="dene istersen";
        a=a+b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
