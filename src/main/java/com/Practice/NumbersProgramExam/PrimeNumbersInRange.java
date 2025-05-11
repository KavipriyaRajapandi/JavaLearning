package com.Practice.NumbersProgramExam;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start:");
        int start = sc.nextInt();
        System.out.println("Enter the end:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");

            }

        }
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
      return true;

    }
}
