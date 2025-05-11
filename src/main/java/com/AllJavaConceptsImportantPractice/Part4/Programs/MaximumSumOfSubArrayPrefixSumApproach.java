package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class MaximumSumOfSubArrayPrefixSumApproach {
    public static void main(String[] args) {
        int[] a = {4,2,-6,5,-3};
        int max = maximumSumSubArray2(a);
        System.out.println(max);
    }
    public static int maximumSumSubArray2(int[] a){
        int[] p = new int[a.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<p.length;i++){
            p[i] = a[i];
            for(int j=i+1;j<p.length;j++){
                p[j] = p[j-1]+a[j];
                if(p[j]>max){
                    max = p[j];
                }
            }
        }
        return max;
    }
}
