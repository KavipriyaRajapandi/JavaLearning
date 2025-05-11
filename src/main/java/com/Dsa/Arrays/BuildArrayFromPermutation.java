package com.Dsa.Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] p = new int[a.length];
        for(int i=0;i<p.length;i++){
            p[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(p));
    }
}
