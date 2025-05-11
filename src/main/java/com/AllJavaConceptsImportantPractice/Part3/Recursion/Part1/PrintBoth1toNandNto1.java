package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

/*
for normal for loop to print
from straight-order and reverse-order we need two for loop which makes O(n2)
we can make it effective by following recursion
 */
public class PrintBoth1toNandNto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        func(n);
    }
    public static void func(int n){
        if(n>0){
            System.out.print(n+" ");
            func(n-1);
            System.out.print(n+" ");
        }
    }

}
