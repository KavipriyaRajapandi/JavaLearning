package com.JavaQspiders.ArrayConcepts.Programs.Merging;

import java.util.Arrays;

public class MergingSecondHalfReverseApproach1 {
    public static void main(String[] args) {
        int[] a ={2,3,4,5};
        int[] b ={6,7,8,9};
        System.out.println("Before Swapping:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("---------------");
        System.out.println("After Reverse Swapping second half:");
        int[] res = solve(a,b);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[]x,int[]y) {
        int start = 0;
        int end = y.length-1;
        while(start<end){
            int temp = y[start];
            y[start] = y[end];
            y[end] = temp;
            start++;
            end--;
        }
        int[] merge_tr = new int[x.length + y.length];
        int m=0;
        int n=0;
        for (int i = 0; i < merge_tr.length; i++) {
            if(m<x.length){
                merge_tr[i] = x[m];
                m++;
            }
            else if(n<y.length){
                merge_tr[i] = y[n];
                n++;
            }
        }
       return merge_tr;
    }
    }
