package com.codelearn.algorithm.generating;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        generate(n);
        sc.close();

    }

    public static boolean checkFinish(int[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 0)
                return false;
        }

        return true;
    }

    public static void nextBitString(int[] s) {
        int i = s.length - 1;
        while (s[i] == 1) {
            s[i] = 0;
            i--;
        }
        s[i] = 1;
    }

    public static void generate(int n) {
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = 0;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();

        boolean stop = false;

        while (!stop) {
            nextBitString(s);
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]);
            }
            System.out.println();
            if (checkFinish(s)) {
                stop = true;
            }

        }

    }

}
