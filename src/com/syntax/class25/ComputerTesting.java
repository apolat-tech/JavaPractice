package com.syntax.class25;

public class ComputerTesting {


    public static void main(String[] args) {
        Computer[] computers=new Computer[4];
        computers[0]=new Apple();
        computers[1]=new Lenovo();
        computers[2]=new Hp();
        computers[3]=new Dell();
for(Computer c:computers){
    c.Cpu();
    c.Ram();
}


    }
}
