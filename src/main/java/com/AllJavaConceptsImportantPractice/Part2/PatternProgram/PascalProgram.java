package com.AllJavaConceptsImportantPractice.Part2.PatternProgram;

import java.util.Scanner;

/*
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
 */

public class PascalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1 && i>=j){
                    System.out.print(j+1+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
