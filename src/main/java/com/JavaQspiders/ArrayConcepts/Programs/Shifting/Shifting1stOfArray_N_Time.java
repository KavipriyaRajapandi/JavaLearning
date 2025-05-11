package com.JavaQspiders.ArrayConcepts.Programs.Shifting;

import java.util.Scanner;
import java.util.Arrays;

public class Shifting1stOfArray_N_Time {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {2,3,4,1,7};
        System.out.println("Before Shifting: "+Arrays.toString(a));
        int n = sc.nextInt();
        solve(a,n);
        System.out.println("After "+n+" times Shifting:"+Arrays.toString(a));
    }
    public static void solve(int[] x,int n)  {
        //for shifting as count needed max is given in n
        for(int k=0;k<n;k++){
            int shift_value = 0;//5th pos in array to store backup taken because going to remove first place
            int temp = x[shift_value];// store the 2 inside temp
            for (int i = 0; i <=x.length-1; i++) { // till 4th position
                if(i<x.length-1) {
                    x[i] = x[i + 1];
                }
                if(i==x.length-1){ //both should check we used it in max min in array too...
                    x[i] = temp;
                }
            }
            //x[shift_value] =
        }
    }
}
