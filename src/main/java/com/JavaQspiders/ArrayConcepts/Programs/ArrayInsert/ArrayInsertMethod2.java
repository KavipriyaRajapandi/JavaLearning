package com.JavaQspiders.ArrayConcepts.Programs.ArrayInsert;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertMethod2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Array size:");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] res = solve(a);
        System.out.println("-------------");
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.print("Enter the Element a"+"["+i+"]:");
            x[i] = sc.nextInt();
        }
        return x;
    }
}
