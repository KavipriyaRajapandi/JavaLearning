package com.Dsa.Arrays;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] a = {1,2,1};
        int[] p = new int[a.length*2];
        for(int i=0;i<a.length;i++){
                p[i] = a[i];
                p[i + a.length] = a[i];
        }
        System.out.println(Arrays.toString(p));
    }
}
