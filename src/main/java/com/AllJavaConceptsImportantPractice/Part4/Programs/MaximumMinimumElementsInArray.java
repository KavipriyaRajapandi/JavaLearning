package com.AllJavaConceptsImportantPractice.Part4.Programs;
import java.util.*;
public class MaximumMinimumElementsInArray {
        public static void main(String[] args){
            int[] a = {5,4,-3,2,7,2};
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i=0;i<a.length;i++){
                if(a[i]>max && a[i]>0){
                    max = a[i];
                }
                else if(a[i]<min){
                    min = a[i];
                }
            }

            System.out.println("Maximum:"+max);
            System.out.println("Minimum:"+min);
        }
}
