package com.AllJavaConceptsImportantPractice.Part5.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionOfMultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows:");
        int n = sc.nextInt();
        System.out.println("Enter how many columns:");
        int m = sc.nextInt();
        int[][] res=  new int[n][m];

        for(int i=0;i<res.length;i++){
            System.out.println("For Array ["+(i+1)+"]: lets insert");
            for (int j = 0; j < res[i].length; j++) {
                System.out.println("Enter ["+(j+1)+"]: value for array:");
                int val = sc.nextInt();
                res[i][j] = val;
            }
        }

        System.out.println(Arrays.deepToString(res));
    }
}
