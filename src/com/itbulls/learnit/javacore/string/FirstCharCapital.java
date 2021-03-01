package com.itbulls.learnit.javacore.string;

import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
		
		sc.close();
	}

	public static String firstCharToTitleCase(String string) {
		String afterString[] = string.split("[\\s]+");
		for (int i = 0; i < afterString.length; i++) {
			
			afterString[i] = afterString[i].substring(0, 1).toUpperCase() + afterString[i].substring(1).toLowerCase();
		}
		return String.join(" ", afterString);
	
	}
	

	
}