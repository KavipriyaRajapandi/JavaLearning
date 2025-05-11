package com.Searching.LinearSearch;

public class FindMinimumIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {90,23,231},
                {43,32},
                {23,76,54,21}
        };
        System.out.println(findMinIn2D(arr));
    }
    static int findMinIn2D(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] a : arr){
            for(int element : a){
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }

}
