package com.Dsa.Multi_Dimensional_Array;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6}
        };

        int row = a.length;
        int column = a[0].length;

        int[][] res = new int[column][row];

        for(int i=0;i<row;i++){
            for (int j = 0; j < column; j++) {
                res[j][i] = a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
