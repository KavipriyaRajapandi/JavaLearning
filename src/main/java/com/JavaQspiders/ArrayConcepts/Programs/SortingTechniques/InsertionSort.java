package com.JavaQspiders.ArrayConcepts.Programs.SortingTechniques;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a ={5,4,3,1,2};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(a));

    }

    public static void insertionSort(int[] x){
        for(int i=1;i<x.length;i++){
            int prev = i - 1;
            int curr = x[i];

            while(prev>=0 && x[prev]>curr){
                x[prev+1] = x[prev];
                prev--;
            }
            //when its coming prev -1
            x[prev+1] = curr;
        }
    }
}
