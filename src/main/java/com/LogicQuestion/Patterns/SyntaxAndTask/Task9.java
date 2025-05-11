package com.LogicQuestion.Patterns.SyntaxAndTask;
/*
*
* *
* * *
* * * *
* * * * *
 */

public class Task9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(j==0||i==n-1||i==j||(i==2&&j<=2)||(i==3&&j<=3)){
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
