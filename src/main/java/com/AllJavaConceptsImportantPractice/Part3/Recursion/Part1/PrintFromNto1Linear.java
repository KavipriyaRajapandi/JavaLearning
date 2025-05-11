package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

public class PrintFromNto1Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number want print in reverse");
        int n = sc.nextInt();
        System.out.println("Enter the reverse order starts");
        int i = sc.nextInt();

        linearPrintNto1(i,n);
    }
    public static void linearPrintNto1(int i,int num){
        if(i<num){
            return;
        }
        System.out.println(i);
        linearPrintNto1(i-1,num);
    }

}
