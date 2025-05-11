package com.JavaQspiders.ArrayConcepts.Algorithm.PrefixSum;

import java.util.Scanner;

public class WorkingExample2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] p = new int[a.length];//[0,0,0,0,0,0]
        System.out.println("Enter the Starting Range:");
        int start = sc.nextInt();
        System.out.println("Enter the Ending Range:");
        int end = sc.nextInt();
        int sum = 0;
        p[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            p[i] = p[i - 1] + a[i];//Important
        }
        for (int i = 0; i < p.length; i++) {
            if (start < end) {
                sum += p[start];
                start++;
            }
        }
        System.out.println("Sum of given Range in Prefix Sum is:" + sum);
    }
}
