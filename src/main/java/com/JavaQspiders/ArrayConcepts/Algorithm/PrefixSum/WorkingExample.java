package com.JavaQspiders.ArrayConcepts.Algorithm.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

//Working of PrefixSum
public class WorkingExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] p = new int[a.length];//[0,0,0,0,0,0]
        p[0] = a[0];
        for (int i = 1; i < a.length;i++){
                p[i] = p[i-1] + a[i];//Important
        }
        System.out.println("Given Array"+Arrays.toString(a));
        System.out.println("Prefix Sum Array"+Arrays.toString(p));
        System.out.println("Enter the Starting range:");
        int start = sc.nextInt();
        System.out.println("Enter the End range:");
        int end = sc.nextInt();
        int sumRange = sumOfSpecifiedRange(p,start,end);
        System.out.println(sumRange);

    }
    public static int sumOfSpecifiedRange(int[] p,int start,int end){
        int sum=0;
        for(int i=0;i<p.length;i++){
            if(start<end){
                sum += p[start];
                start++;
            }
        }

        return sum;
    }
}
