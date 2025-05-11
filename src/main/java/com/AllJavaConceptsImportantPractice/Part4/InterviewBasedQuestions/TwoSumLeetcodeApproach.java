package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

import java.util.Arrays;
/*
If we see a combination we return those index one time.
 */
public class TwoSumLeetcodeApproach {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twosum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twosum(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;

        while(left<nums.length){
            if(right<=left){
                left++;
                right = nums.length-1;
                continue;
            }
            if(nums[left]+nums[right]==target){
                return new int[]{left,right};
            }
            right--;
        }
        return new int[0];
    }
}
