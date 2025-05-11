package com.JavaQspiders.ArrayConcepts.Programs.Merging;

import java.util.Arrays;

public class MergeTwoArray2Pointers {
    public static void main(String[] args) {
        int[] a = {4,5,6,2};
        int[] b = {7,8,3,1};
        int[] res = solve(a,b);

        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] x,int[] y){
        int[] c = new int[x.length+y.length];
        int middle = c.length/2;
        int m = 0;
        int n = 0;
        for(int i=0;i<c.length;i++){
            if(m<x.length){
                c[i] = x[m];
                m++;
            }
            if(n<y.length){
                c[middle] = y[n];
                middle++;
                n++;
            }
        }
        return c;
    }
}
