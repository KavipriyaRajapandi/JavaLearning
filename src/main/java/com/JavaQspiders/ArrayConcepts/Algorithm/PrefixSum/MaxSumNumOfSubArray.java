package com.JavaQspiders.ArrayConcepts.Algorithm.PrefixSum;
//Following Prefix Sum
public class MaxSumNumOfSubArray {
    public static void main(String[] args) {
        int [] a = {4,2,-6,5,-3};
        int [] p = new int[a.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < p.length; i++) {
            p[i] = a[i];
            for (int j = i+1; j < p.length; j++) {
               p[j] = p[j-1] + a[j];
               if(p[j]>max){
                   max = p[j];
               }
            }
        }
        System.out.println("Maximum Sum of Number Sub Array using Prefix Sum is "+max);
    }
}
