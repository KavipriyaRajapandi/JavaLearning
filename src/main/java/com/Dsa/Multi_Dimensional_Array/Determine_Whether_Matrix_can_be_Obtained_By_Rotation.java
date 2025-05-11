package com.Dsa.Multi_Dimensional_Array;

import java.util.Arrays;

/*
Given two n x n binary matrices mat and target, return true if it is
possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
 */
public class Determine_Whether_Matrix_can_be_Obtained_By_Rotation {
    public static void main(String[] args) {
        int[][] mat = { {0,0,0},
                        {0,1,0},
                        {1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};

        boolean res = obtainedByRotation(mat,target);
        if(res){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    public static boolean obtainedByRotation(int[][] mat,int[][] target){
        for(int i=0;i<4;i++){
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            mat = isRotated(mat);
        }
        return false;
    }
    public static int[][] isRotated(int[][] mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                rotated[j][n-1-i] = mat[i][j];
            }
        }
        return rotated;
    }
}
