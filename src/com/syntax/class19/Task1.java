package com.syntax.class19;

public class Task1 {
    int age;
    String name;

    Task1() {
        System.out.println("I will be called when there is no argument");
    }

    Task1(String name) {
        System.out.println("I will be called when there is 1 argument " + name);
    }

    Task1(String name, int age) {
        System.out.println("I will be called when there is 2 argument " + name +" " +age);
    }

    public static void main(String[] args) {
        Task1 class1 = new Task1("Ali");
        Task1 class2 = new Task1("Ali", 42);
        Task1 class3 = new Task1();

    }
}

