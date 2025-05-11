package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

import java.util.TreeSet;

public class ContainsDuplicateSlidingWindow {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if there's an element equal to nums[i] in the current window
            if (set.contains(nums[i])) {
                return true;
            }

            // Add the current element to the TreeSet
            set.add(nums[i]);

            // Remove the element that's sliding out of the window
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // Output: false
    }
}
