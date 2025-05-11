package com.JavaQspiders.ArrayConcepts.Programs;

public class MaxMinElementArray {
    public static void main(String[] args) {
        int[] a = {5,4,-3,2,7,2};
        solve(a);
    }

    public static void solve(int[] x){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < x.length; i++) {
            if(x[i] > max){
                max = x[i];
            }
            if(x[i] < min){
                min = x[i];
            }

        }
        System.out.println("Maximum Number:"+max);
        System.out.println("Minimum Number:"+min);
    }

}
