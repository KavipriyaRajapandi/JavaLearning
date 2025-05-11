package com.JavaQspiders.ArrayConcepts.Programs.Shifting;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingSirApproach {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a= {2,3,4,1,7};
        System.out.println("Before Shifting");
        System.out.println(Arrays.toString(a));
        System.out.print("Enter how many times need to shift:");
        int n = sc.nextInt();
        solve(a,n);
        System.out.println("After Shifting");
        System.out.println(Arrays.toString(a));
    }

    public static void solve(int[] x,int n){
        for(int k=0;k<n;k++){
            int last = x[0];//ithula first and last value eduka mudiyum matha mudiyum centre values mudiyathu intha strategy follow panna
            for (int i = 0; i < x.length-1; i++) {
                x[i] = x[i+1];
            }
            x[x.length-1] = last; // ithu x reference nalla inga access panna mudiyuthu first and last but for in-between values ku for loop la yum access panna mudiyum
        }
    }
}
