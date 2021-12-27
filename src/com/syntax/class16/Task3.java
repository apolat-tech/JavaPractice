package com.syntax.class16;

public class Task3 {

    public static void main(String[] args) {

        int[][] array = {{1, 3, 4}, {4, 8, 9}, {5, 2, 1}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    sum += array[i][j];

                }
            }
        }
        System.out.print(sum);

    }
}

