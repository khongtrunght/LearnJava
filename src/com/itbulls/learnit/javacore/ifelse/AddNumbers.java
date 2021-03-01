package com.itbulls.learnit.javacore.ifelse;

public class AddNumbers {

	public static void main(String[] args) {
		if (args[0].contains(".") || args[1].contains(".")) {
			double Double1 = Double.parseDouble(args[0]);
			double Double2 = Double.parseDouble(args[1]);
			System.out.println(Double1 + Double2);
		} else {
			int Int1 = Integer.parseInt(args[0]);
			int Int2 = Integer.parseInt(args[1]);
			System.out.println(Int1 + Int2);
		}
	}

}
