package com.LogicQuestion.Patterns.Problems;
/*
              *
            * *
          * * *
        * * * *
      * * * * *
 */

import java.util.Scanner;

class LeftHalfPyramidPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values:");
        int n = sc.nextInt();
        int i,j;

        for(i=n;i>=1;i--){
            //for empty spaces
            for(j=1;j<i;j++){ //entha value marutho iteration la antha value vachu trace pannu
                System.out.print("  ");
            }
            for (j = 0;j<=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
