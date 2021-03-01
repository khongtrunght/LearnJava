package com.itbulls.learnit.javacore.emumerations.hw;

import java.util.Scanner;

import com.itbulls.learnit.javacore.emumerations.Message;


public class messagePriority {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();

			if (isValidMessageType(userInput)) {
				System.out.println(Message.valueOf(userInput).getPriority());
				break;
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		String[] check = {"A","B","C","D"};
		for (String letter : check) {
			if (letter.equals(userInput))
				return true;
		}
		return false;
	}

}

