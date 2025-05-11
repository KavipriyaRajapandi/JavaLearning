package com.SDEsheet.Recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int left = 0;
        int right = a.length-1;
        reverseArray(a,left,right);
        System.out.println(Arrays.toString(a));
    }
    public static void reverseArray(int[] a,int left,int right){
        if(left<right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        else{
            return;
        }
        reverseArray(a,left,right);
    }
}
