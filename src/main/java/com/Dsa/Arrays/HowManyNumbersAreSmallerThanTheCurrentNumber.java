package com.Dsa.Arrays;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] a = {8,1,2,2,3};
        int[] p = new int[a.length];
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++){
                if(a[i]>a[j] && i!=j){
                    p[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(p));
    }
}
