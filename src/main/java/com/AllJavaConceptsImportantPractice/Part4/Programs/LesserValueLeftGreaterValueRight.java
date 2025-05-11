package com.AllJavaConceptsImportantPractice.Part4.Programs;

/*
Lesser Value Should Be Left at Array, Greater Value Should Be Right at Array
Input: [-1,5,7,8,-6,-2,4,-16]
Output: [-1,-16,-2,-6,8,7,4,5]
 */

import java.util.Arrays;

public class LesserValueLeftGreaterValueRight {
    public static void main(String[] args) {
        int[] a = {-1,5,7,8,-6,-2,4,-16};

        solve(a);
    }
    public static void solve(int[] a){
        int left = 0;
        int right = a.length-1;

        while(left<right){
            if(a[left]>0 && a[right]<0){
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
                right--;
            }
            if(a[left]<0){
                left++;
            }
            if(a[right]>0){
                right--;
            }
        }

        System.out.println(Arrays.toString(a));


    }
}
