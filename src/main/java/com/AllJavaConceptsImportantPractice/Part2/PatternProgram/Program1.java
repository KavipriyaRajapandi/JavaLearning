package com.AllJavaConceptsImportantPractice.Part2.PatternProgram;
/*
  0 1 2 3 4
0     *
1     *
2 * * * * *
3   *   *
4 *       *
 */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || (j==n/2 && i<=n/2) || (i==j && i>=n/2) || (i+j==n-1 && i>=n/2)){
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
