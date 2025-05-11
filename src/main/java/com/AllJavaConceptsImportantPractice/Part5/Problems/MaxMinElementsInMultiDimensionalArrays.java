package com.AllJavaConceptsImportantPractice.Part5.Problems;

public class MaxMinElementsInMultiDimensionalArrays {
    public static void main(String[] args) {
        int [] a[] =  {
                {8,2,1,6,5},
                {4,84,7,0,-3},
                {16,1,5},
                {2,-4,8,-3}
        };
        for(int i=0;i<a.length;i++){
            maxminElement(a[i]);
        }
    }
    public static void maxminElement(int[]a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.print("Maximum:"+max+" ");
        System.out.println("Minimum:"+min);

    }
}
