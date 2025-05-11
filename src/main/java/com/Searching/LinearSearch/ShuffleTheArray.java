package com.Searching.LinearSearch;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] ans = shuffled(arr,3);
        System.out.println(Arrays.toString(ans));

    }
    static int[] shuffled(int[] nums,int n){
        int[] ans = new int[2 * n];

        for(int i = 0;i<2*n;i++){
            if(i%2==0){
                ans[i] = nums[i / 2];
            }
            else{
                ans[i] = nums[n+i/2];
            }
        }
        return ans;
    }

}
