package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndMergeSecondHalfArrayApproach2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {4,5,6,7};

        int [] res = ReverseAndMerge(a,b);
        System.out.println(Arrays.toString(res));
    }
    public static int[] ReverseAndMerge(int[] a,int [] b){
        int start = 0;
        int end = b.length-1;

        while(start<end){
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
            start++;
            end--;
        }
        int[] merge_tr = new int[a.length+b.length];
        int m = 0;
        int n = 0;

        for (int i = 0; i < merge_tr.length; i++) {
            if(i>=merge_tr.length/2){
                merge_tr[i] = b[m];
                m++;
            }
            else{
                merge_tr[i] = a[n];
                n++;
            }
        }
        return merge_tr;
    }
}
