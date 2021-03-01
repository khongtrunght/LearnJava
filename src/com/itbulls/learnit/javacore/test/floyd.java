package com.itbulls.learnit.javacore.test;

import java.util.Arrays;

public class floyd {
    
    
    public static void main(String[] args) {
    	int[][] truy_vet = new int[5][5];
    	for (int i = 0; i < truy_vet.length; i++) {
    		for (int j = 0; j < truy_vet.length; j++) {
    			truy_vet[i][j] = -1;				
			}
			
		}
    	int inf = 1000;
		int[][] a = new int[][]  {{0,inf,-2,inf},{4,0,3,inf},{inf,inf,0,2},{inf,-1,inf,0}};
		
		int[][] result = floyd(a, truy_vet);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(String.format("%4d", truy_vet[i][j]));	
			}
			System.out.println();
		}
		
		System.out.println(trace(a, result, truy_vet, 1, 3));
    }

    public static int[][] floyd(int[][] arr, int[][] truy_vet) {
        int n = arr.length;
        int[][] d = Arrays.copyOf(arr, n);
        for (int mid = 0; mid < n; mid++) {
            for (int st = 0; st < n; st++) {
                for (int fn = 0; fn < n; fn++) {
                    if (d[st][mid] + d[mid][fn] < d[st][fn]) {
                        d[st][fn] = d[st][mid] + d[mid][fn] ;
                        truy_vet[st][fn] = mid;
                    }
                }
            }
        }

        return d;
    }
    
    
    public static String trace(int[][] a, int [][] result, int[][] truy_vet, int i, int j) {
    	String street = new String();
    	if (a[i][j] == result[i][j]) {
    		street = Integer.toString(i) + Integer.toString(j);
    		return street;
    	}
    	else {
    		int tach = truy_vet[i][j];
    		street = trace(a, result, truy_vet, i, tach) + Integer.toString(tach) + trace(a, result, truy_vet, tach,j);
    		return street;
    	}
    	
    		
    }
    
    
    
}
