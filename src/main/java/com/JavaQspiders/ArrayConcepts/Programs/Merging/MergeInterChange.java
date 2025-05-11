package com.JavaQspiders.ArrayConcepts.Programs.Merging;

import java.util.Arrays;

public class MergeInterChange {
    public static void main(String[] args) {
        int[] a={2,3,4,5};
        int[] b={6,7,8,9};

        int[] res = solve(a,b);

        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[]x,int[]y){
        int[] merge_tic = new int[x.length+y.length];
        int m=0;
        int n=0;
        for(int i=0;i<merge_tic.length;i++){
            if(i%2==0){
                merge_tic[i] = x[m];
                m++;
            }
            if(i%2!=0){
                merge_tic[i] = y[n];
                n++;
            }
        }

        return merge_tic;
    }
}
