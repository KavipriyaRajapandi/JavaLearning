package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

public class PrintGivenNto1BackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        reverseOrder(n);
    }
    public static void reverseOrder(int n){
        if(n>0){
            System.out.print(n+" ");
            reverseOrder(n-1);
            //No code after recursion called Tail Recursion
        }

    }
}
