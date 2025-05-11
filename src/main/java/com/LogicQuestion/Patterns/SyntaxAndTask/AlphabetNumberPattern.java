package com.LogicQuestion.Patterns.SyntaxAndTask;

import java.util.Scanner;

public class AlphabetNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j;

        for(i=0;i< n;i++){
            char ch = 'A';
            for (j = 0; j < n ; j++) {
                if(i%2==0){
                    System.out.print(ch++ +" ");
                }
                else{
                    System.out.print(j+1 +" ");
                }

            }
            System.out.println();
        }


    }
}
