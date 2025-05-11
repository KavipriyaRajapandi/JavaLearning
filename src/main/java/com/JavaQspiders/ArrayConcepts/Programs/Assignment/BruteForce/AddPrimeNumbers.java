package com.JavaQspiders.ArrayConcepts.Programs.Assignment.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class AddPrimeNumbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {2,1,0,3,5,4,6,7};
        System.out.println(Arrays.toString(a));
        System.out.println("To find Prime numbers in this Array:");
        int sum = addPrime(a);
        System.out.println("Sum of Prime Numbers in given Arrays is "+sum);
    }
    public static boolean primeNumber(int p){
        if(p==0||p==1){
            return false;
        }
        for (int i = 2; i < p-1; i++) {
            if(p%i==0){
                return false;
            }
        }
        return true;
    }

    public static int addPrime(int[]x){
        int sum=0;
        for (int i = 0; i < x.length; i++) {
            if(primeNumber(x[i])==true){
                sum += x[i];
            }
        }
        return sum;
    }
}
