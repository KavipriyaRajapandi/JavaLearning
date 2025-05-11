package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {5,0,1,6,2};
        missingNumber(a);
    }
    public static void missingNumber(int[] a){
        Arrays.sort(a);
        int count = 0;
        for(int i=0;i<a.length;i++,count++){
            if(count!=a[i]){
                System.out.print(count+" ");
                i--;
            }
        }
    }
}
