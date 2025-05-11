package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

public class PrintFrom1toNBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last value:");
        int n = sc.nextInt();
        straightorder(n);
    }
    public static void straightorder(int n){
        if(n>0){
            straightorder(n-1);
            System.out.print(n+" ");
        }
    }
}
