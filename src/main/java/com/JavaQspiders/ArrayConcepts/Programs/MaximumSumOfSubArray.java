package com.JavaQspiders.ArrayConcepts.Programs;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] a = {4,2,-6,5,-3};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int start = i;
            for(int j=i;j<a.length;j++){
                int end = j;
                for (int k = start; k <=end; k++) {
                    sum += a[k];
                }
                if(sum>max){
                    max = sum;
                }
                sum=0;
            }

        }
        System.out.println(max);

    }
}
