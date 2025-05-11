package com.LogicQuestion.Patterns.SyntaxAndTask;

public class Task8 {
    public static void main(String[] args) {
        int n = 13;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(i==0||j==0||j==1||j==2||i+j==n-1||i==n/2||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            if(i==n/2){
                System.out.print("\t\t\t\tn=13");
            }
            System.out.println();

        }
    }
}
