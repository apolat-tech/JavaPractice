package com.syntax.class22;

public class Programming {
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String lang) {
        System.out.println("I love " + lang);
    }

    public static void main(String[] args) {
        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");
    }
}

