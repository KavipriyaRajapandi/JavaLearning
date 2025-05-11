package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class MergeAndInterChange {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {4,5,6,7};

        int [] res = mergeInterChange(a,b);
        System.out.println(Arrays.toString(res));
    }
    public static int[] mergeInterChange(int[] a,int[] b){
        int[] res = new int[a.length+b.length];
        int n = 0;
        int m = 0;

        for(int i=0;i<res.length;i++){
            if(i%2==0){
                res[i] = a[n];
                n++;
            }
            if(i%2!=0){
                res[i] = b[m];
                m++;
            }
        }
        return res;

    }
}
