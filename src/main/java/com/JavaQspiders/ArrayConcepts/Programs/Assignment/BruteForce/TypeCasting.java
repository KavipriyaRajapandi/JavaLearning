package com.JavaQspiders.ArrayConcepts.Programs.Assignment.BruteForce;

import java.util.Arrays;

public class TypeCasting {
    public static void main(String[] args) {
        int[] a={'A','B','C','D'};
        System.out.println(Arrays.toString(a));

        char[] b = {'A','B','C','D'};

        for (int i = 0; i < b.length; i++) {
            System.out.print((int)b[i]+",");
        }

    }
}
