package com.LogicQuestion.Patterns.SyntaxAndTask;

public class Syntax {
    public static void main(String[] args) {
        // if using -- simple to understand (if place we need to change places)
        for(int i=0;i<2;i++){ //no of rows
           //enter outer for loop
            for(int j=0;j<5;j++) { //no of columns
                //enter inner for loop
                if (true) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }//after loop ends go to outer for loop
            System.out.println();
        }

    }
}
