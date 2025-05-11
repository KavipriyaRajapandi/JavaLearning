package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Scanner;

public class FindTargetSum2BruteForce {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {8,7,2,3,1,6};
        System.out.println("Enter your Target:");
        int target = sc.nextInt();

        solve(a,target);
    }
    public static void solve(int[] a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] +a[j] == target){
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}
