package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArrayUsingMethods {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a = {10,20,30,40};
        System.out.println(Arrays.toString(a));
        int [] res = solve(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] a){
        int [] res = new int[a.length];
        for(int i=a.length-1,m=0;i>=0;i--,m++){
            res[m] = a[i];
        }
        return res;
    }
}
