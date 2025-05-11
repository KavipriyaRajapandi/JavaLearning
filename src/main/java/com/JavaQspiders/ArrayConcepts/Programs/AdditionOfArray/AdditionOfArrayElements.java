package com.JavaQspiders.ArrayConcepts.Programs.AdditionOfArray;
import java.util.Arrays;
public class AdditionOfArrayElements {
    public static void main(String[] args) {
        int[] a = {4,5,6,2};
        System.out.println(Arrays.toString(a));
        int res = solve(a);
        System.out.println("Sum of the Given array:"+res);
    }
    public static int solve(int[] x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        return sum;
    }
}
