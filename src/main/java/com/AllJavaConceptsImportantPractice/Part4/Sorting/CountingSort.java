package com.AllJavaConceptsImportantPractice.Part4.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1,3,4,7,3,7};
        System.out.println(Arrays.toString(a));
        int[] res= new int[findmax(a)+1];
        for(int i=0;i<a.length;i++){
            res[a[i]]++;
        }
        countingSort(a,res);
        System.out.println(Arrays.toString(a));
        
    }
    public static void countingSort(int[]a,int[] res){
        int j = 0;
        for(int i=0;i<res.length;i++){
            while(res[i]>0){
                a[j] = i;
                j++;
                res[i]--;
            }
        }
    }
    public static int findmax(int[]a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
