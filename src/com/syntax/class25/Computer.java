package com.syntax.class25;

public class Computer {
    public void Cpu() {
        System.out.println("Computer has I7");
    }

    public void Ram() {
        System.out.println("Computer has 8GB ram");
    }


}

class Apple extends Computer {
    public void Cpu() {
        System.out.println("Apple has I5");
    }
}

class Lenovo extends Computer {
    public void Cpu() {
        System.out.println("Lenovo has I3");
    }
}

class Hp extends Computer {
    public void Cpu() {
        System.out.println("Hp has I5");
    }
}

class Dell extends Computer {


    public void Ram() {
        System.out.println("Dell has 16GB Ram");
    }

}

