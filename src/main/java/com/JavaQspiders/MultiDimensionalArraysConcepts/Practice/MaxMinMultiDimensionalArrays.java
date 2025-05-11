package com.JavaQspiders.MultiDimensionalArraysConcepts.Practice;

public class MaxMinMultiDimensionalArrays {
    public static void main(String[] args) {
        int [] a[] =  {
                {8,2,1,6,5},
                {4,84,7,0,-3},
                {16,1,5},
                {2,-4,8,-3}
        };
        for(int i = 0;i<a.length;i++){
            findingMaxMin(a[i]);
        }
    }
    public static void findingMaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        System.out.print("Max:"+max);
        System.out.println("\tMin:"+min);
    }
}
