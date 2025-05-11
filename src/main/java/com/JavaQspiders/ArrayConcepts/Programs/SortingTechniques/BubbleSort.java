package com.JavaQspiders.ArrayConcepts.Programs.SortingTechniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {8,5,-3,-1,0,6,7,-3};
        bubbleSort(a);
    }
    public static void bubbleSort(int[] a){
        System.out.println("Before Swapping:");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length-1; i++) {
            for (int j = 0; j <a.length-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Swapping:");
        System.out.println(Arrays.toString(a));
    }
}
