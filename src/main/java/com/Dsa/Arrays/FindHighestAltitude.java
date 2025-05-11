package com.Dsa.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] a = {-5,1,5,0,-7};
        int k = 0;
        int[] p = new int[a.length+1];
        p[0] = 0;

        for (int i = 1; i < p.length; i++,k++) {
            p[i] = a[k];
        }
        int[] arr = new int[p.length];
        int max = 0;
            arr[0] = p[0];
            for(int j=1;j<p.length;j++){
                arr[j] = arr[j-1] + p[j];
                if(arr[j]>max){
                    max = arr[j];
                }
            }

        System.out.println(max);
    }
}
