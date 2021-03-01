package com.itbulls.learnit.javacore.misc;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		String arr = new String();
		for (int i = 1; i < height*2; i++) {
			for (int j = 0; j < height - Math.abs(height - i); j++) {
				System.out.print("*");
			}
			System.out.println();
				
			
		}
	}

}
