package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class PrintDuplicateElementsInArray {
    public static void main(String[] args) {
        int[] a= {8,4,8,1,2,6,1,7,9,8,9,8,8,8,2,3,1,2};
        printDuplicate(a);
    }
    public static void printDuplicate(int[] a){
        Arrays.sort(a);
        for(int i = 0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                System.out.print(a[i]+" ");

                while(i<a.length-1 && a[i]==a[i+1]){
                    i++;
                }
            }
        }
    }
}
