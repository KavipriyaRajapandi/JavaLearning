package com.JavaQspiders.ArrayConcepts.Programs.Assignment.TwoPointers;

import java.util.Arrays;

/*
Input:[0,1,1,0,1,1,0,0]
Output:[0,0,0,0,1,1,1,1]
all lesser value should be at left
all greater value should be at right
//MOSTLY RECOMMEND WHILE LOOP FOR TWO POINTERS
 */
public class LesserValueLeftGreaterValueRight {
    public static void main(String[] args) {
        int[] a = {-1,5,7,8,-6,-2,4,-16};
        int left = 0;
        int right = a.length-1;
        while(left<right){
        if(a[left]>0 && a[right]<0) {
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
