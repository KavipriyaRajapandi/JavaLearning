package com.Dsa.Multi_Dimensional_Array;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};

        for(int i=0;i<a.length;i++) {
            isReverse(a[i]);
        }

        for(int i=0;i<a.length;i++){
            invertImage(a[i]);
        }
        int[][] res = new int[a.length][];
        for(int i=0;i<res.length;i++){
            res[i] = new int[a[i].length];
        }

        for(int i=0;i<res.length;i++){
           res[i] = a[i];
        }
        System.out.println(Arrays.deepToString(res));
    }
    public static void isReverse(int[] a){
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static void invertImage(int[]a){
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                a[i] = 1;
            }
            else if(a[i] == 1){
                a[i] = 0;
            }
        }
    }
}
