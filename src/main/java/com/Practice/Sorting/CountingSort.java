package com.Practice.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {2,5,3,0,2,3,0,3};
        System.out.println("Before Swapping:");
        System.out.println(Arrays.toString(a));
        int[] res = new int[findLargest(a)+1];//process 2 - we are just taking new array here not any returning // after getting max value traverse a new array for loop to store index count
        for (int i = 0; i < a.length; i++) {//im dumb we are checking in a and incrementing in res process 4//my error here res.length checking for wrong array
            res[a[i]]++; // default value int 0 to increment to 1
        }
        System.out.println("After Swapping:");
        countingSort(a,res);
        System.out.println(Arrays.toString(a));
    }
    //process 3
    public static void countingSort(int[]x,int[]res){
        int j=0;
        for(int i=0;i<res.length;i++){
            while(res[i]>0){
                x[j] = i; //index value storing trick
                res[i]--;
                j++;
            }
        }
    }
    //process 1 to find largest number
    public static int findLargest(int[] a){
        //traverse
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
