package com.syntax.class20;

public class Teacher {
    String name;
    String subject;

    void teach() {
        System.out.println("I am teaching");
    }

    public static void main(String[] args) {
        mathTeacher mt1=new mathTeacher();
        mt1.name="Pi";
        mt1.subject="Math";
        mt1.teach();
        mt1.math();

        chemistryTeacher ch1=new chemistryTeacher();
        ch1.name="Ahmet";
        ch1.subject="Chemistry";
        ch1.teach();
        ch1.chemistry();

    }
}

class mathTeacher extends Teacher {
    void math() {
        System.out.println("This is math");
    }

}
class chemistryTeacher extends Teacher {
    void chemistry() {
        System.out.println("This is chemistry");
    }

}

