package com.codelearn.algorithm.generating;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] first = new int[n + 1], last = new int[n + 1], res = new int[n + 1];

        for (int i = 1; i < n + 1; i++)
            first[i] = i;

        for (int i = 1; i < n + 1; i++) {
            last[i] = n - i + 1;
        }

        res = first.clone();
        while (!Arrays.equals(res, last)) {

            print(res);

            nextPermutation(res);

        }

        print(res);
        sc.close();

    }

    public static void swap(int[] res, int a, int b) {
        int tg = res[a];
        res[a] = res[b];
        res[b] = tg;
    }

    public static void nextPermutation(int[] res) {
        int n = res.length - 1;
        int j = res.length - 2;
        while (res[j] > res[j + 1]) {
            j--;
        }

        int k = res.length - 1;
        while (res[j] > res[k])
            k--;

        swap(res, j, k);

        int finalt = n;
        int start = j + 1;
        while (finalt > start) {
            swap(res, finalt, start);
            finalt--;
            start++;
        }

    }

    public static void print(int[] res) {
        for (int i = 1; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println();
    }

}
