package com.itbulls.learnit.javacore.misc;

public class RefactoringDemo {

	public static void main(String[] args) {

		printToConsole();
	}

	private static void printToConsole() {

		System.out.println("Some code that are not aligned");
		int sum = 10 + 5;
		System.out.println(sum);

	}
}