package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class MaximumSumOfSubArrayBruteForceApproach {
    public static void main(String[] args) {
        int[] a = {4,2,-6,5,-3};

        int max = maximumsubarray1(a);
        System.out.print(max);
    }
    public static int maximumsubarray1(int[] a){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += a[k];
                }
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
