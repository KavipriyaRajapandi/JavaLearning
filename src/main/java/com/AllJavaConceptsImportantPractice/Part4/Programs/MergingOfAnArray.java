package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class MergingOfAnArray {

        public static void main(String[] args) {
            int[] a = {1,2,3,4};
            int[] b = {5,6,7,8};
            int n=0;
            int m=0;

            int [] res = new int[a.length+b.length];
            for(int i=0;i<res.length;i++){

                if(i>=res.length/2){
                    res[i] = b[n];
                    n++;
                }
                else{
                    res[i] = a[m];
                    m++;
                }
            }
            System.out.println(Arrays.toString(res));
        }
}
