package com.LogicQuestion.Patterns.SyntaxAndTask.NewConcept;

import java.util.Scanner;

public class SandClockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int i,j;

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i+j<=n-1&&i<=j||i>=j&&i+j>=n-1){
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
