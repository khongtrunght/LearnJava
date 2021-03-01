package com.itbulls.learnit.javacore.string;

public class StringProcessor {
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator()
			+ "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator()
			+ "james;Derek James;james@gmail.com" + System.lineSeparator() + "jackson;Walter Jackson;jackson@gmail.com"
			+ System.lineSeparator() + "gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));

		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));

	}

	public static String convert1(String input) {

		String people[] = input.split(System.lineSeparator());
		String output[] = new String[people.length - 1];
		for (int i = 1; i < people.length; i++) {
			String temp[] = people[i].split(";");
			output[i - 1] = String.join(" ==> ", temp[0], temp[2]);
		}

		return String.join(System.lineSeparator(), output);
	}

	public static String convert2(String input) {
		String people[] = input.split(System.lineSeparator());
		String output[] = new String[people.length - 1];
		for (int i = 1; i < people.length; i++) {
			String temp[] = people[i].split(";");
			output[i - 1] = temp[1] + " (email: " + temp[2] + ")";
		}

		return String.join(System.lineSeparator(), output);
	}

}
