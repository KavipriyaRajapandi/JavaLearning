package com.AllJavaConceptsImportantPractice.Part4.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,1,2};
        insertionSort(a);

    }
    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            int prev = i-1;
            int curr = a[i];
            while(prev>=0 && a[prev]>curr){
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
        System.out.println(Arrays.toString(a));
    }
}
