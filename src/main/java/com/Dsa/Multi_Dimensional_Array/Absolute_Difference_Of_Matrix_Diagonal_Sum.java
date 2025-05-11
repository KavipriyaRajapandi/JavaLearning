package com.Dsa.Multi_Dimensional_Array;

public class Absolute_Difference_Of_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                {4,5,6},
                {9,8,9}};
        int n = a.length;
        int primarySum = 0;
        int secondarySum = 0;

        for(int i=0;i<n;i++){
            primarySum += a[i][i];
            secondarySum += a[i][n-1-i];
        }

        int absDiff = 0;
        absDiff = secondarySum - primarySum;

        System.out.println(absDiff);

    }
}
