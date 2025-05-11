package com.AllJavaConceptsImportantPractice.Part4.Programs;
/*
3.Reverse the Array (Any one approach)
Input: [10,20,30,40]
Output: [40,30,20,10]

 */

import java.util.Arrays;

public class ReverseTheArrayEffectiveApproach {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        System.out.println(Arrays.toString(a));
        /*optionalint[] res = */solve(a);
        System.out.println(Arrays.toString(a));
    }
    public static void /*int[]*/ solve(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        //return a;
    }
}
