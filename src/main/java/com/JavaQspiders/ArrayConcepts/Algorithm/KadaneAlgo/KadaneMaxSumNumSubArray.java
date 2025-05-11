package com.JavaQspiders.ArrayConcepts.Algorithm.KadaneAlgo;
/*
Step-by-Step Process of Kadane's Algorithm
Here's a step-by-step breakdown of how Kadane's Algorithm works:

Initialize two variables, max_so_far and max_ending_here, to 0.
Iterate through the array from left to right, examining each element one by one.
For each element, update max_ending_here as the maximum value is either the current element or the sum of the current element and max_ending_here.
Update max_so_far as the maximum of either the current max_so_far or max_ending_here.
Repeat steps 3 and 4 for all elements in the array.
The value of max_so_far at the end of the iteration will be the maximum subarray sum.
 */

public class KadaneMaxSumNumSubArray {
    public static void main(String[] args) {
        int [] a ={2, 3, -8, 7, -1, 2, 3};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];

            if(max_ending_here<0){
                max_ending_here = 0;
            }

            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
        }
        System.out.println(max_so_far);


    }
}
