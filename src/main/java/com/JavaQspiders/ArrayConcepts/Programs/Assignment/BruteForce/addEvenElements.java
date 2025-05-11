package com.JavaQspiders.ArrayConcepts.Programs.Assignment.BruteForce;

public class addEvenElements {
    public static void main(String[] args) {
        int[] a={6,4,3,2,1,7};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                sum += a[i];
            }
        }
        System.out.println("Sum of given Array is "+sum);
    }
}
