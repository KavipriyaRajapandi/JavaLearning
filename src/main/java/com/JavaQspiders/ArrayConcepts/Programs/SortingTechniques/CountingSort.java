package com.JavaQspiders.ArrayConcepts.Programs.SortingTechniques;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] a={2,5,3,0,2,3,0,3,8,20,98,17};
        System.out.println("Before Swapping:");
        System.out.println(Arrays.toString(a));
        int[] res = new int[findLargest(a)+1];
        for (int i = 0; i < a.length; i++) {
            res[a[i]]++;
        }
        countingSort(a,res);
        System.out.println("After Swapping:");
        System.out.println(Arrays.toString(a));


    }
    public static void countingSort(int[]a,int[] res){
        int j = 0;
        for (int i = 0; i < res.length; i++) {
            while(res[i]>0){
                a[j] = i;
                j++;
                res[i]--;
            }
        }
    }

    public static int findLargest(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
