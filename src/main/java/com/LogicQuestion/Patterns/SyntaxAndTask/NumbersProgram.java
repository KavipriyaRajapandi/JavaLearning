package com.LogicQuestion.Patterns.SyntaxAndTask;

import java.util.Scanner;

public class NumbersProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {

                if(i==j||i>=j){
                    System.out.print(j+1 + " ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
