package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

/*
3.Reverse the Array (Any one approach)
Input: [10,20,30,40]
Output: [40,30,20,10]

 */
public class ReverseTheArrayApproach1 {
    public static void main(String[] args) {
        int [] a = {10,20,30,40};
        int [] res = new int[a.length];

        for(int i=res.length-1,m=0;i>=0;i--,m++){
            res[m] = a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
