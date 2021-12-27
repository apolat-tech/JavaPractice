package com.syntax.class22;

public class Task1 {

    double calculateArea(int a, int b) {
        double area = a * b;
        return area;
    }

    double calculateArea(int a) {
        double area = a * a;
        return area;
    }

    double calculateArea(int a, int b, int c) {
        double area = a * b * c;
        return area;
    }

    public static void main(String[] args) {
        Task1 t1=new Task1();
        System.out.println(t1.calculateArea(10,5));
        System.out.println(t1.calculateArea(10,5,2));
        System.out.println(t1.calculateArea(15));

    }
}

