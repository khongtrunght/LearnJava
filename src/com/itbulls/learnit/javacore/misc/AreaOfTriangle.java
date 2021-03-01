package com.itbulls.learnit.javacore.misc;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		float a = sc.nextFloat();		
		
		System.out.print("Please, enter B side of a triangle: ");
		float b = sc.nextFloat();
		
		System.out.print("Please, enter C side of a triangle: ");
		float c = sc.nextFloat();
		
		float p = (a+b+c) / 2;
		float triangleArea = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.println("Triangle area is: " + triangleArea);
		sc.close();


	}

}
