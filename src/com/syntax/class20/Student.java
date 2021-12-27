package com.syntax.class20;

public class Student {
    String name;
    String address;


    Student(String name, String address){
        this.name=name;
        this.address=address;

    }

    public static void main(String[] args) {
        Student stu1 = new Student("Ali", "8 Belfast");
        System.out.println("Name: "+stu1.name+" & Address: " +stu1.address);
        Student stu2 = new Student("Veli", "18 Celfast");
        System.out.println("Name: "+stu2.name+" & Address: " +stu2.address);
    }


}



