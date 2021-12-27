package com.syntax.class21;

public class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    double CalculateArea() {
        double area;
        area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(11);
        System.out.println(c1.CalculateArea());
    }
}
