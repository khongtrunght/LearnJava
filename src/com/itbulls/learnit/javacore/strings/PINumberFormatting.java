package com.itbulls.learnit.javacore.strings;

public class PINumberFormatting {

	public static void main(String[] args) {
//		print pi 5 times
		double pi = Math.PI;
		String s1 = String.format("%.1f", pi);
		String s2 = String.format("%.2f", pi);
		String s3 = String.format("%.3f", pi);
		String s4 = String.format("%.4f", pi);
		String s5 = String.format("%.5f", pi);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
