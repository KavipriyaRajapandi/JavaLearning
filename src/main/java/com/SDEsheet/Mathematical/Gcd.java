package com.SDEsheet.Mathematical;

import java.util.Arrays;
import java.util.Scanner;

public class Gcd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("First Number:");
        int a = sc.nextInt();
        System.out.println("Second Number:");
        int b = sc.nextInt();

        int res = gcd(a, b);
        System.out.println("GCD is "+res);
    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
