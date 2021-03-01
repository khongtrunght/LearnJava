package com.itbulls.learnit.javacore.method;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
	
        String str = sc.nextLine();
        
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int maxInt = findMaxIntInArray(intArray);
        
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
        sc.close();
	}

	
	public static int findMaxIntInArray(int[] intArray) {
        int max = intArray[0];
        for (int i : intArray) {
            if (i > max)
                max = i;
        }
        return max;
	}
}
    

