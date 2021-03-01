package com.itbulls.learnit.javacore.misc;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(100) + 1);
	}
}
