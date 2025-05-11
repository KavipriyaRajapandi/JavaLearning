package com.JavaQspiders.ArrayConcepts.Programs.Merging;

import java.util.Arrays;

public class MergingSecondHalfReverseApproach3 {
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
        int[] c = new int[y.length];
        int m = 0;
        for (int i = c.length-1; i >= 0; i--,m++) {
            c[m] = y[i];
        }
        int[] merge_tr = new int[x.length+c.length];
        int n = 0;
        int o = 0;
        for (int i = 0; i < merge_tr.length; i++) {
            if(n<x.length){
                merge_tr[i] = x[n];
                n++;
            }
            else if(o<c.length){
                merge_tr[i] = c[o];
                o++;
            }
        }
        return merge_tr;
    }
}
