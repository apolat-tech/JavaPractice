package com.syntax.class15;

public class Task5 {
    public static void main(String[] args) {
        String sentences= "Today is a 44656good day 7478398 ##%2^^&*$#@#^876(*(^%%$ask";
        String sent2=sentences.replaceAll("[^0-9]","");
        sent2=sent2.replaceAll("[\\s]","");
        //System.out.println(sent2);
        System.out.println(sent2.length());
    }

}
