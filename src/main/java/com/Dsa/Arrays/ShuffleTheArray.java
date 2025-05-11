package com.Dsa.Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        int n = a.length/2;

        int[] p = new int[a.length];

        for(int i=0;i<n;i++){
            p[i*2] = a[i];
            p[i*2+1] = a[i+n];
        }
        System.out.println(Arrays.toString(p));
    }
}
