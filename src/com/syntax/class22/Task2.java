package com.syntax.class22;

public class Task2 {
    static void print(String a) {
        System.out.println("This is with String overloaded");
    }

    static void print(int a) {
        System.out.println("This is with int overloaded");
    }

    static void print(boolean a) {
        System.out.println("This is with boolean overloaded");
    }

    public static void main(String[] args) {
        Task2.print(10);
        Task2.print("A");
        Task2.print(true);

    }
}
