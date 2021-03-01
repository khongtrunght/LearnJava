package com.itbulls.learnit.javacore.misc;

public class PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5, }, { 6, 7 }, { 8, 9, 10 } };

		for (int[] is : matrix) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
