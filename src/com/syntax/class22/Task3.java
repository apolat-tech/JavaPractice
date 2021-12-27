package com.syntax.class22;

public class Task3 {
    private void print(String a) {
        System.out.println("This is with String overloaded");
    }

    private void print(int a) {
        System.out.println("This is with int overloaded");
    }

    private void print(boolean a) {
        System.out.println("This is with boolean overloaded");
    }

    public static void main(String[] args) {
    /*    Task2.print(10);
        Task2.print("A");
        Task2.print(true);*/

        Task3 task3=new Task3();
        task3.print(10);
        task3.print("A");
        task3.print(true);
        task3.print(15);

    }
}
