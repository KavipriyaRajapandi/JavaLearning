package com.AllJavaConceptsImportantPractice.Part2.PatternProgram;

import java.util.Scanner;

public class HollowHourGlassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j < n; j++) {
                if(i+j==n-1 || i==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }



        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1 || i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j < n; j++) {
                if(i==j || i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
