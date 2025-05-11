package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Range:");
        int startRange = sc.nextInt();
        System.out.println("Enter the Ending Range:");
        int endingRange = sc.nextInt();

        for (int i = startRange; i <= endingRange; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
    public static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
