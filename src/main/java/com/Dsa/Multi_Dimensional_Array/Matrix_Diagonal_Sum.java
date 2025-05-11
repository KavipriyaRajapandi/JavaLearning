package com.Dsa.Multi_Dimensional_Array;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int n = a.length;
        int primarySum = 0;
        int secondarySum = 0;

        for(int i=0;i<n;i++){
            primarySum += a[i][i];
            secondarySum += a[i][n-1-i];
        }

        //odd matrix length means subtract by middle element
        if(n%2!=0){
            secondarySum -= a[n/2][n/2];
        }

        System.out.println(primarySum+secondarySum);
    }
}
