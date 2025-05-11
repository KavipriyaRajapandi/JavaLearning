package com.AllJavaConceptsImportantPractice.Part4.Programs;

/*
Kth Largest Element
Input: [8,4,-3,16,7,12,1], k=3
Output: 8
 */

import java.util.Scanner;

public class KthLargestElementInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = {8,4,-3,16,7,12,1};
        System.out.println("Enter which largest Number you need:");
        int k = sc.nextInt();

        int res = solve(a,k);
        System.out.println(k+" maximum element is "+ res);
    }
    public static int solve(int[] a,int k){
        int max = 0;
        for(int i=1;i<=k;i++){
            max = Integer.MIN_VALUE;
            for(int j=0;j<a.length;j++){
                if(max<a[j]){
                    max = a[j];
                }
            }
            for(int j=0;j<a.length;j++){
                if(max==a[j]) {  // && i!=k
                    a[j] = Integer.MIN_VALUE;
                }
            }

        }
        return max;
    }

}
