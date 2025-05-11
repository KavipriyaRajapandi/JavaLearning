package com.AllJavaConceptsImportantPractice.Part4.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4,-3,4,4,-6,0,2};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void selectionSort(int[]a){
        for(int i=0;i<a.length;i++){
            int s = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[s]>a[j]){
                    int temp = a[s];
                    a[s] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
