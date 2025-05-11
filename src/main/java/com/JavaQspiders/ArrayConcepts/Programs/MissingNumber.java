package com.JavaQspiders.ArrayConcepts.Programs;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] a = {5,0,1,6,2};
        Arrays.sort(a);
        missnum(a);
    }
    public static void missnum(int[] a){
        int start = 0;
        for (int i = 0; i < a.length; i++,start++) {
            if(a[i] != start){
                System.out.println(start);
                i--;
            }
        }
        return;
    }
}
