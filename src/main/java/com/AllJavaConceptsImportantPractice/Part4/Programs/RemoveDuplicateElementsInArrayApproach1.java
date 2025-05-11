package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class RemoveDuplicateElementsInArrayApproach1 {
    public static void main(String[] args) {
        int[] a = {8,4,8,1,2,6,1,7,9};
        removeDuplicates(a);

    }
    public static void removeDuplicates(int[]a){
        Arrays.sort(a);
        int[] p = new int[a.length];
        int j = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                p[j] = a[i];
                j++;
            }
        }
        p[j] = a[a.length-1];
        j++;

        int[] res = new int[j];
        for (int i = 0; i < res.length; i++) {
            res[i] = p[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
