package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

import java.util.Scanner;

public class PrintFrom1toNLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number till want to print:");
        int num = sc.nextInt();
        int i = 1;

        linear1toN(i,num);
    }
    public static void linear1toN(int i,int num){
        if(i>num){
            return;
        }
        System.out.println(i);
        linear1toN(i+1,num);
    }
}
