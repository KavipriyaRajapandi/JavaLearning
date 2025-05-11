package com.AllJavaConceptsImportantPractice.Part4.Programs;

/*
Input:[1,8,0,1,7,2,0,6,3,1,4]
target = 10
 */
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class DifferentInputsFindTargetSum3EffectiveApproach {
    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 1, 7, 2, 0, 6, 3, 1, 4};
        int target = 10;
        //{0,0,1,1,1,2,3,4,6,7,8}
        solve(nums, target);
    }

    public static void solve(int[] a, int target) {
        Arrays.sort(a);
        //3 pointers
        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = a.length - 1;
            while (left < right) {
                int sum = a[i] + a[left] + a[right];

                if (sum == target) {
                    System.out.println(a[right] + "," + a[left] + "," + a[i]);
                    left++;
                    right--;
                    //Check for duplicate near left and near right if there same process going to skip
                    while (left < right && a[left] == a[left - 1]) {
                        left++;
                    }
                    while (left < right && a[right] == a[right + 1]) {
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
