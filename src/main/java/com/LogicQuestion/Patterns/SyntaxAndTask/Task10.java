package com.LogicQuestion.Patterns.SyntaxAndTask;

public class Task10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(j==n-1||i==0||i==j||(i<=1 && j==2) || (i<=2 && j==3)){
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
