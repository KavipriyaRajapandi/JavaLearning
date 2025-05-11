package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class MaximumSumOfSubArrayKadaneAlgorithm {
    public static void main(String[] args) {
        int[] a = {4,2,-6,5,-3};
        int max = maximumSumSubArray3(a);
        System.out.println(max);
    }
    public static int maximumSumSubArray3(int[] a){
        int max_so_far = a[0];
        int max_ending_here = a[0];
        for(int i=1;i<a.length;i++){
            max_ending_here = Math.max(a[i]+max_ending_here,a[i]);
            max_so_far = Math.max(max_ending_here,max_so_far);
        }
        return max_so_far;
    }
}
