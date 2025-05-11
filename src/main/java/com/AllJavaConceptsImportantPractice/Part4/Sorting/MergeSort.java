package com.AllJavaConceptsImportantPractice.Part4.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {8,7,1,4,3,48,16,12};
        System.out.println(Arrays.toString(a));
        divide(0,a.length-1,a);
        System.out.println(Arrays.toString(a));
    }
    public static void divide(int l,int h,int[] a){
        if(l==h){
            return;
        }
        int m = (l+h)/2;
        divide(l,m,a);
        divide(m+1,h,a);
        merge(l,m,h,a);
    }
    public static void merge(int l,int m,int h,int [] a){
        int left = l;
        int right = m+1;
        int x = 0;
        int[] k = new int[a.length];
        while(left<=m && right <=h){
            if(a[left]>a[right]){
                k[x] = a[right++];
                x++;
            }
            else{
                k[x] = a[left++];
                x++;
            }
        }
        while(left<=m){
            k[x++] = a[left++];
        }
        while (right<=h){
            k[x++] = a[right++];
        }

        x=0;
        for(int i=l;i<=h;i++,x++){
            a[i] = k[x];
        }
    }
}
