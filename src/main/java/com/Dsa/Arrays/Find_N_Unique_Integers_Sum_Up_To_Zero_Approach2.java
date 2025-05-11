package com.Dsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_N_Unique_Integers_Sum_Up_To_Zero_Approach2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] res = isSumUpZero(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isSumUpZero(int n){
        int[] a = new int[n];
        if(n%2==0){
            for(int i=1;i<a.length;i+=2){
                a[i-1] = i;
                a[i] = -i;
            }
            return a;
        }
        else{
            a[0] = 0;
            for(int i=1;i<a.length;i+=2){
                a[i] = i;
                a[i+1] = -i;
            }
            return a;
        }
    }
}
