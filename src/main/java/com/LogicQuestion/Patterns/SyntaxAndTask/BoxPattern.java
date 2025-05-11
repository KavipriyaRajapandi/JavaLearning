package com.LogicQuestion.Patterns.SyntaxAndTask;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i,j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n ; j++) {

                if(i==j||i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("");
            //box2
            for (j = 0; j < n; j++) {
                if(i==j||i<=j){
                    System.out.print(j%2+" ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for (j = 0; j < n; j++) {

                if(i+j>=n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for (j = 0; j < n; j++) {
                if(i+j<=n-1){
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
