package com.codelearn.algorithm.counting;

public class zero {
    public static void main(String[] args) {
        int[] arr = new int[11];
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 8;
        for (int i = 4; i <= 10; i++)
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4] ;
        System.out.println(arr[10]);
    }
}
