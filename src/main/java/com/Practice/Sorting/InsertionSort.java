package com.Practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9,3,7,4,0,4};
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.print("After Sorting: ");
        System.out.print(Arrays.toString(a));
    }

    public static void insertionSort(int[] x){
        for(int i=1;i<x.length;i++){
            int prev = i - 1;
            int curr = x[i];
            while(prev>=0 && x[prev]>curr){
                x[prev+1] = x[prev];
                prev--; // prev cards we dont know how much so -- unitl reach prev=-1
            }
            x[prev+1] = curr;
        }
    }
}
