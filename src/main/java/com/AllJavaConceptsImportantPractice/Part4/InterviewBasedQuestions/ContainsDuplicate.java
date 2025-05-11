package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

import java.util.Arrays;
/*
O(n log n)
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        // {1,1,1,2,2,3,3,3,4,4}
        boolean ans = solve(nums);
        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean solve(int[]a){
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                return true;
            }
        }
        return false;
    }
}
