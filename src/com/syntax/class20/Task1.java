package com.syntax.class20;

public class Task1 {


    static void print() {
        System.out.println("This is from A");
    }

    public static void main(String[] args) {
        B b = new B();
        b.print();
        b.printB();
        C c=new C();
        c.print();
        c.printB();
        c.printC();

    }
}

class B extends Task1 {
    void printB() {
        System.out.println("This is just from B");

    }


}

class C extends B {
    void printC() {
        System.out.println("This is just from C");

    }
}

