package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        //return index
        int[] a = twosum(num,target);
        System.out.println(Arrays.toString(a));
    }
    public static int[] twosum(int[] num,int target){
        int left = 0;
        int right = num.length-1;
        while(left<=right || right==0){
            if(right==0){
                left++;
                right = num.length-1;
            }
            if(num[left]+num[right]==target){
                return new int[]{left,right};
            }
            if(num[left]>num[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[0];
    }
}
