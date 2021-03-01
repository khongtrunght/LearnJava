package com.itbulls.learnit.javacore.emumerations;

import java.util.Scanner;

public class EnumDemo {
	public static void main(String[] args) {
		Priority priority = Priority.HIGH;

		Scanner sc = new Scanner(System.in);
		String pri = sc.next();
		Priority priority2 = Priority.valueOf(pri);
		switch (priority2) {
		case HIGH:
			System.out.println("High Pri");
			break;
		case MEDIUM:
			System.out.println("MEDIUM Pri");
			break;
		case LOW:
			System.out.println("Low Pri");
			break;
		}

		Priority[] priValue = Priority.values();
		for (Priority pris : priValue) {
			System.out.println(pris);
		}
		
		sc.close();
	}
}