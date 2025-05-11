package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class MergingArrayUsingTwoPointers {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b=  {5,6,7,8};

        int[] res = mergeTwoPointer(a,b);
        System.out.println(Arrays.toString(res));

    }
    public static int[] mergeTwoPointer(int[] a,int[] b){
        int[] merge_tp = new int[a.length+b.length];
        int m = 0;
        int n = 0;
        int middle = merge_tp.length/2;

        for(int i=0;i<merge_tp.length;i++){
            if(m<a.length){
                merge_tp[i] = a[m];
                m++;
            }
            if(n<b.length){
                merge_tp[middle] = b[n];
                n++;
                middle++;
            }

        }
        return merge_tp;
    }
}
