package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 } };
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++)
				System.out.println(array[i][j]);

		}
	}
}
