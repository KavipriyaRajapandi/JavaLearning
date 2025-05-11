package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertionOfElementsArrayFunctionCall {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] res = solve(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println("Insert the Elements you want to a["+i+"]:");
            x[i] = sc.nextInt();
        }
        return x;
    }
}
