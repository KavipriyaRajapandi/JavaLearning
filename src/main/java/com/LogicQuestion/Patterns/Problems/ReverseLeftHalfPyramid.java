package com.LogicQuestion.Patterns.Problems;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values:");
        int n = sc.nextInt();
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if(i==j||i<=j){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
