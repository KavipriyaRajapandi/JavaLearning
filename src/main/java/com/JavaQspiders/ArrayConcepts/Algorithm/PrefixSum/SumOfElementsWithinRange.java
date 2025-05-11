package com.JavaQspiders.ArrayConcepts.Algorithm.PrefixSum;

import java.util.Scanner;

public class SumOfElementsWithinRange {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] p = new int[a.length];
        System.out.println("Enter the Starting Range:");
        int start = sc.nextInt();
        System.out.println("Enter the Ending Range:");
        int end = sc.nextInt();
        int sum = 0;
        p[0] = a[0];
        for(int i=1;i<a.length;i++){
            p[i] = p[i-1] + a[i];
        }
        sum = p[end] - p[start];
        System.out.println("sum of elements within range is "+sum);
    }
}
