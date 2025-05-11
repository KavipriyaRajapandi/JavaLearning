package com.AllJavaConceptsImportantPractice.Part5.Problems;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5},
                {7,14,35,23,12},
                {43,17,23}
        };
        int[][] b = {
                {5,3,8,9},
                {3,9},
                {23,65,43,11,23},
                {76,23,12}
        };
        //for rows
        int[][] res = new int[a.length][];
        //for columns
        for(int i=0;i<res.length;i++){
            res[i] = new int[a[i].length];
        }

        //addition
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
