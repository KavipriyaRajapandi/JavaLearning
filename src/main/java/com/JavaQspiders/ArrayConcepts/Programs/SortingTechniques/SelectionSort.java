package com.JavaQspiders.ArrayConcepts.Programs.SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {4, -3, 4, 4, -6, 0, 2};
        selectionSort(a);
    }

    public static void selectionSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int s = i;
            for (int j = i+1; j < x.length; j++) {
                if (x[j] < x[s]) {
                    int temp = x[s];
                    x[s] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
