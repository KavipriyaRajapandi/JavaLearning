package com.AllJavaConceptsImportantPractice.Part2.PatternProgram;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if(n-i>=j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1; j <=n ; j++) {
                if(n-i>=j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
