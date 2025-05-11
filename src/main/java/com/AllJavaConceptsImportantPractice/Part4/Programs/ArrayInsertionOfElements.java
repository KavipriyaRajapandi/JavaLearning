package com.AllJavaConceptsImportantPractice.Part4.Programs;

/*
1.Array Insertion of Elements
Input: 4
Output: [10,20,30,40]

 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements want to insert:");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the Elements to insert a["+i+"]:");
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
