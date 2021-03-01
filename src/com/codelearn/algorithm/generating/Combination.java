package com.codelearn.algorithm.generating;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
//		to hop dau tien
		int[] first = new int[m+1];
		for (int i = 1; i <= m; i++) {
			first[i] = i;
		}
		
//		to hop cuoi cung
		int[] last = new int[m+1];
				for (int i = 1; i <= m; i++) {
					last[i] = n - m + i;
				}
		
		
		int[] res = first.clone();
		Permutation.print(res);
		
		while (!Arrays.equals(res,last)) {
			nextCombination(res,m,n);
			Permutation.print(res);
		}
		
	
	}
	
	public static void nextCombination(int[] res, int m, int n) {
		int i = m;
		while (res[i] == n - m + i) {
			i--;
		}
		res[i] += 1;
		for(int j = i+1; j<= m; j++) {
			res[j] = res[i] + j - i;
		}
		
	}
	
	

}
