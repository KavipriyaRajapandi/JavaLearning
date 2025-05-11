package com.JavaQspiders.MultiDimensionalArraysConcepts.Practice;

public class RotationProgram {
    public static void main(String[] args) {
        int [][] a = {
                {1,2,3,4},
                {1,2,3},
                {1,2,3,4,5},
                {1,2,3,4,5,6}
        };

        for (int i = 0; i < a.length; i++) {
            rotationArray(a[i],i);
        }
    }
    public static void rotationArray(int[] arr,int x){
        for(int k=0;k<x;k++){
            int start = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = start;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
