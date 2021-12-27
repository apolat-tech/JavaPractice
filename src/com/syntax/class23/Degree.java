package com.syntax.class23;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

    public static void main(String[] args) {
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();

        Masters masters = new Masters();
        masters.getPrerequisite();
    }
}

