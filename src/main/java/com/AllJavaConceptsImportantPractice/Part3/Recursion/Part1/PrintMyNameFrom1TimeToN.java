package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

public class PrintMyNameFrom1TimeToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many times names need to print:");
        int n = sc.nextInt();
        int i= 1;

        printname(i,n);

    }

    public static void printname(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Sibi Varshaan");
        printname(i+1,n);
    }
}
