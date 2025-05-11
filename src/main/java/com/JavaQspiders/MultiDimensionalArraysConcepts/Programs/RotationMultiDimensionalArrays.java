package com.JavaQspiders.MultiDimensionalArraysConcepts.Programs;

import java.util.Arrays;

public class RotationMultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3,4},
            {1,2,3},
            {1,2,3,4,5},
            {1,2,3,4,5,6}
        };

        for(int i = 0;i<a.length;i++){
            rotation(a[i],i);
        }

    }
    public static void rotation(int[] arr,int x){
        for (int k = 0; k <=x; k++) {
            if(x==0){
                System.out.println(Arrays.toString(arr));
            }
            else{
                for(k=0;k<x;k++){
                    int last = arr[0];
                    for (int i = 0; i < arr.length-1; i++) {
                        arr[i] = arr[i+1];
                    }
                    arr[arr.length-1] = last;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

}
