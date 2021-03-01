package com.itbulls.learnit.javacore.operations;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please print any word: ");
		String word = sc.next();
		System.out.println("You entered this word: " + word);
		System.out.print("Enter integer: ");
		int i = sc.nextInt();
		System.out.println("You enter : " + i);
		sc.close();
	}

}
