package com.syntax.class18;

public class Methods {
    int arraySum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        //System.out.println(sum);
        return sum;
    }

    public String reverse(String str) {
        int l = str.length();
        String rstr = "";
        for (int i = l - 1; 0 <= i; i--) {
            rstr += str.substring(i, i + 1);
            //System.out.println(i +" "+ rstr);

        }

        return rstr;
    }


    String vowel(String str) {
        int l = str.length();
        String rstr = "";
        for (int i = 0; i <= l - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                rstr += str.charAt(i);
                rstr += " ";

            }


            //System.out.println(i +" "+ rstr);

        }
        return rstr;
    }
}
