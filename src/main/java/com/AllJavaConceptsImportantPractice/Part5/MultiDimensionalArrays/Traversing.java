package com.AllJavaConceptsImportantPractice.Part5.MultiDimensionalArrays;

public class Traversing {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10,11,12},
                {13,14}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
