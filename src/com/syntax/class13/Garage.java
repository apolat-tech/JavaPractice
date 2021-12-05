package com.syntax.class13;

public class Garage {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.numberOfDoors=4;
        car1.color="black";
        car1.size=4;
        car1.make="BMW";
        car1.model="i8";

        Car car2=new Car();
        car2.numberOfDoors=2;
        car2.color="red";
        car2.size=2;
        car2.make="Ferrari";
        car2.model="f4";

        System.out.println("Car1's color: "+car1.color);
        System.out.println("Car2's color: "+car2.color);


    }
}
