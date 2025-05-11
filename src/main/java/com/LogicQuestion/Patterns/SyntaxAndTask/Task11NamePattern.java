package com.LogicQuestion.Patterns.SyntaxAndTask;

import java.util.Scanner;

public class Task11NamePattern {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Size:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            //Box 1
            for (int j = 0; j < n; j++) {
                if(i==0||i==n/2||i==n-1||j==0 && i<=n/2||j==n-1 && i>=n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   ");
            //Box 2
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("   ");
            //Box 3 //
            for (int j = 0; j < n; j++) {
                if (j == 0 ||
                        (i == 0 && j < n - 1) ||
                        (i == n / 2 && j < n - 1) ||
                        (i == n - 1 && j < n - 1) ||
                        (j == n - 1 && (i != 0 && i != n / 2 && i != n - 1)))
                    System.out.print("* ");
                 else
                    System.out.print("  ");

            }
            System.out.print("   ");
            //Box 4
            for (int j = 0; j < n; j++) {
                if(i==0||j==n/2||i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();



        }
    }
}
