package com.JavaQspiders.MultiDimensionalArraysConcepts.Working;


import java.util.Arrays;

public class TraverseTheDynamicMultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
