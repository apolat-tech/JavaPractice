package com.syntax.class17;

public class Task2 {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.empID = 11;
        em1.salary = 1000;
        em1.empPrint();

        Employee em2 = new Employee();
        em2.empID = 15;
        em2.salary = 1100;
        em2.empPrint();

        Student stu1=new Student();
        stu1.studentName="A";
        stu1.studentID=101;
        Student.numberOfStudents+=1;

        Student stu2=new Student();
        stu2.studentName="A";
        stu2.studentID=101;
        Student.numberOfStudents+=1;
        System.out.println(Student.numberOfStudents);
    }
}
