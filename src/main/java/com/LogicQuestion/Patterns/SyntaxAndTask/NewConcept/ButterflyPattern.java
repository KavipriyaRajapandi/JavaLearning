package com.LogicQuestion.Patterns.SyntaxAndTask.NewConcept;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper wings
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n; j++) {
                if(i+j>=n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//lower wings
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j<=n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n; j++) {
                if(i<=j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
