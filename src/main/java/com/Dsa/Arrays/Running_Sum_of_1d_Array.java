package com.Dsa.Arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] a = {3,1,2,10,1};
        int[] p = new int[a.length];
        p[0] = a[0];
        for(int i=1;i<p.length;i++){
            p[i] = p[i-1] + a[i];
        }
        System.out.println(Arrays.toString(p));


    }
}
