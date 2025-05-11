package com.JavaQspiders.ArrayConcepts.Programs.ReverseOfArray;

import java.util.Arrays;

public class ReverseArrayNormalApproach {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(Arrays.toString(a));
        int[] res = solve(a);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] x){
        int[] b = new int[x.length];

        for(int i=x.length-1,m=0;i>=0;i--,m++){
            b[m] = x[i];
        }
        return b;
    }
}
