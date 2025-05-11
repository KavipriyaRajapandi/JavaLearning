package com.JavaQspiders.ArrayConcepts.Programs.ReverseOfArray;

import java.util.Arrays;

public class ReverseArrayEffectiveApproach {
    public static void main(String[] args) {
        int[] a= {10,20,30,40};
        System.out.println(Arrays.toString(a));
        solve(a);
        System.out.println(Arrays.toString(a));

    }
    public static void solve(int[] x){
        int left = 0;
        int right = x.length-1;
        while(left<right){
            int temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }
    }

}
