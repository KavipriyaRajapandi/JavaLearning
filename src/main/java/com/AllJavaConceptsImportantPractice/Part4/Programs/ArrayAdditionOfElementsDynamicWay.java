package com.AllJavaConceptsImportantPractice.Part4.Programs;
/*
2.Add the Array Elements
Input: [4,5,6,2]
Output: 17

 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdditionOfElementsDynamicWay {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int sum = 0;

        for(int i=0;i<a.length;i++){
            System.out.println("Insert the Elements first:");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Array elements of "+ Arrays.toString(a)+" Sum is "+sum);
    }
}
