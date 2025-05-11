package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;
/*
15. Fibonacci Series
Input: A number n (e.g., 5)
Output: The first n terms of the Fibonacci series.
Example:
Input: 5
Output: [0, 1, 1, 2, 3]
 */

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();

        int t1 = 0;
        int t2 = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = t1+t2;
            System.out.print(t1+" ");
            t1 = t2;
            t2 = sum;
        }
    }

}
