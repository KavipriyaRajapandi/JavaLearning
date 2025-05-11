package com.AllJavaConceptsImportantPractice.Part4.Searching.BinarySearch;

import java.util.Arrays;

public class Working {
    public static void main(String[] args) {
        int [] a = {16,22,54,76,43,56,1,34,99};
        int key = 99;
        if(binarySearch(a,key)){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
    public static boolean binarySearch(int[] a,int key){
        Arrays.sort(a);
        int left = 0;
        int right = a.length-1;
        while(left<=right) {
            int middle = (left+right)/2;
            if (key == a[middle]) {
                return true;
            }
            else if (key < a[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return false;
    }
}
