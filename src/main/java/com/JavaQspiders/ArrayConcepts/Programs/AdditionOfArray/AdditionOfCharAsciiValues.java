package com.JavaQspiders.ArrayConcepts.Programs.AdditionOfArray;

import java.util.Arrays;

public class AdditionOfCharAsciiValues {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d'};
        System.out.println(Arrays.toString(a));
        int res = solve(a);
        System.out.println("Sum of the given char is: "+res);

    }
    public static int solve(char[] x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }
}
