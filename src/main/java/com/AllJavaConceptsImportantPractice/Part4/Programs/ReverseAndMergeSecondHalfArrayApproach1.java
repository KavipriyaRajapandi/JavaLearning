package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class ReverseAndMergeSecondHalfArrayApproach1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};

        int [] res = reverseAndMerge(a,b);

        System.out.println(Arrays.toString(res));

    }
    public static int[] reverseAndMerge(int[] a,int[] b){
        int [] rev = new int[b.length];
        int m = 0;

        for(int i=b.length-1;i>=0;i--,m++){
            rev[i] = b[m];
        }

        int[] res = new int[a.length+b.length];
        int n = 0;
        int o = 0;

        for(int i=0;i<res.length;i++){
            if(i>=res.length/2){
                res[i] = rev[o];
                o++;
            }
            else{
                res[i] = a[n];
                n++;
            }
        }

        return res;

    }

}
