package com.syntax.class16;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String sentence="What did you use the most?";
        String[] stringArray=sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for(int i=0; i<stringArray.length;i++){
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            System.out.println(stringBuilder);
            stringArray[i] = stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));
    }
}
