package com.AllJavaConceptsImportantPractice.Part5.Problems;

import java.util.Arrays;

public class ReverseInMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};

        for(int i=0;i<a.length;i++){
            isReverse(a[i]);
        }
        System.out.println(Arrays.deepToString(a));
    }
    public static void isReverse(int[] a){
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

    }
}
