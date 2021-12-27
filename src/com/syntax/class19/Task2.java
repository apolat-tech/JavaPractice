package com.syntax.class19;

public class Task2 {

    static class Student {
        String name;
        double elaGrade;
        double mathGrade;
        double scienceGrade;

        double CalculateAverage(double elaGrade, double mathGrade, double scienceGrade) {
            double sum;
            sum = elaGrade + mathGrade + scienceGrade;
            return sum / 3;
        }

        Student(String name1, double elaGrade1, double mathGrade1, double scienceGrade1) {
            name = name1;
            elaGrade = elaGrade1;
            mathGrade = mathGrade1;
            scienceGrade = scienceGrade1;


        }

    }

    public static void main(String[] args) {
        Student stu1 = new Student("Ali", 90, 91, 95);
        System.out.print(stu1.name+"'s average is ");
        System.out.println(stu1.CalculateAverage(90,91,95));
        Student stu2 = new Student("Veli", 93, 91, 89);
        System.out.print(stu2.name+"'s average is ");
        System.out.println(stu2.CalculateAverage(93,91,89));
        Student stu3 = new Student("Adam", 91, 90, 90);
        System.out.print(stu3.name+"'s average is ");
        System.out.println(stu3.CalculateAverage(91,90,90));
        Student stu4 = new Student("Vi", 13, 21, 81);
        System.out.print(stu4.name+"'s average is ");
        System.out.println(stu4.CalculateAverage(13,21,81));

    }
}
