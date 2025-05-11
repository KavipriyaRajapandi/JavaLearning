package com.Dsa.Multi_Dimensional_Array;

import java.util.Arrays;

public class Cells_With_Odd_Values_in_Matrix {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m = 2;
        int n = 3;
        int[][] matrix = new int[m][n];

        for(int i=0;i<indices.length;i++){
            int row = indices[i][0];
            int col = indices[i][1];

            // Increment the entire row
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            // Increment the entire column
            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%2==1){
                    count++;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("No of odd Number in matrix: "+count);
    }
}
