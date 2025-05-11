package com.JavaQspiders.ArrayConcepts.Programs.Assignment.TwoPointers;

import java.util.Arrays;

public class FindTargetSum3NumbersUsing3Pointers {
    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 1, 7, 2, 0, 6, 3, 1, 4};
        //int[] nums={8,7,2,3,1,6};
        int target = 10;

        findTargetTriplets(nums, target);
    }

    public static void findTargetTriplets(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array to handle duplicates easily

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements for the first number
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    System.out.println(nums[right]+","+nums[left]+","+nums[i]);
                    left++;
                    right--;

                    // Skip duplicates for the second and third numbers
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}

