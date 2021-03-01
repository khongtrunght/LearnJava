package com.itbulls.learnit.javacore.misc;

import java.util.Scanner;

public class NewLineForDigit {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
		String s = sc.next();
		char arr[] = s.toCharArray();
		for (char i : arr) {
			System.out.println(i);
		}
		sc.close();
    }
   
}