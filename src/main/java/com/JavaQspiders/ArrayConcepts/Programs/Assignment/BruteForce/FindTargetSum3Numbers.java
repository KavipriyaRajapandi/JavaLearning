package com.JavaQspiders.ArrayConcepts.Programs.Assignment.BruteForce;

public class FindTargetSum3Numbers {
    public static void main(String[] args) {
        int[] a = {1,8,0,1,7,2,0,6,3,1,4};
        int target = 10;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i]+a[j]+a[k]==target){
                        System.out.println(a[i]+","+a[j]+","+a[k]);
                    }
                }
            }
        }
    }
}
