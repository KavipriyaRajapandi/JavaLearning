package com.LogicQuestion.Patterns.SyntaxAndTask;

public class Task6 {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

// //                 F row    F column    last column    last row      middle row   middle column  sameRCSide  opposite row from 0 to 4 and column from 4 to 0 so i==3 and j==1 i+j=4
//                if( i==0 || j==0     ||   j==n-1     ||    i==n-1  ||  i==n/2    ||  j==n/2     ||  i==j    || i+j==n-1 ){
//                    System.out.print("* ");
//                }
                if(i==0 || j==0 ||j==n-1||i==n-1||i==j||i+j==n-1||i==n/2||j==n/2){
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
