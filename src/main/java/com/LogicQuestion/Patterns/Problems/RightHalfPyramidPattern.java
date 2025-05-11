package com.LogicQuestion.Patterns.Problems;

/*
*
* *
* * *
* * * *
* * * * *
 */

import java.util.Scanner;

public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input:");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // if i == j gonna print sideways from top left to bottom right, when i=3 nad j=3 we want to print at i=3 at last before j=2,j=1.
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
