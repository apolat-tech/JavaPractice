package com.syntax.class17;

public class Task1 {
    public static void main(String[] args) {
        // starts the code from here
        String s1 = "hello how are you";
        boolean result = false;
        int length = s1.length();
        // System.out.println(s1.substring(length - 1));
        if (s1.substring(length - 1).equals("u")) {
            result = true;
        }
        // if(s1.substring(beginIndex, endIndex)==you){
        System.out.println(result);
        String[] array = s1.split(" ");
        int arrayLength = array.length;
        if (array[arrayLength - 1].equals("world")) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        if (array[arrayLength - 1].equals("are")) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
        if (array[arrayLength - 1].equals("you") ) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
