package com.Searching.LinearSearch;

import java.util.Arrays;

public class FindMaximum2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,38},
                {9,7},
                {23,5,8,6},
                {12,34}

        };

        System.out.println(findMaxin2D(arr));


    }
    static int findMaxin2D(int[][] arr) {
        int max = Integer.MIN_VALUE;


        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;


    }
}
