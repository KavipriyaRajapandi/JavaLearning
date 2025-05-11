package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionOfElementsUsingMethods {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the length wants to insert:");
        int s = sc.nextInt();
        int [] a = solve(s);
        System.out.println(Arrays.toString(a));
    }
    public static int[] solve(int size){
        int [] a = new int[size];

        for(int i=0;i<a.length;i++){
            System.out.println("Enter the elements to insert in array a["+i+"]:");
            a[i] = sc.nextInt();
        }
        return a;
    }
}
