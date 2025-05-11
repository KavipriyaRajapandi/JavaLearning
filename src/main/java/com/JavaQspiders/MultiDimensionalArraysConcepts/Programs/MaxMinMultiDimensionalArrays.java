package com.JavaQspiders.MultiDimensionalArraysConcepts.Programs;

public class MaxMinMultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] a =  {
                {8,2,1,6,5},
                {4,84,7,0,-3},
                {16,1,5},
                {2,-4,8,-3}
        };
        for(int i=0;i<a.length;i++) {
            solve(a[i]);
        }
    }
    public static void solve(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Max:"+max);
        System.out.print("\tMin:"+min);
        System.out.println();
    }
}
