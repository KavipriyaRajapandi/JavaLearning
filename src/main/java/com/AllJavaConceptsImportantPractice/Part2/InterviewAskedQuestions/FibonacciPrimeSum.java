package com.AllJavaConceptsImportantPractice.Part2.InterviewAskedQuestions;

import java.util.Scanner;

public class FibonacciPrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value:");
        int start = sc.nextInt();
        System.out.println("Enter the End Value:");
        int end = sc.nextInt();
        System.out.println("Enter the Limit Value:");
        int limit = sc.nextInt();
        int sum = 0;
        int t1 = 0;
        int t2 = 1;

        while(t1<=end){
            if(t1>=start && isPrime(t1)){
                sum += t1;
            }
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }

        System.out.println(sum>limit?"Yes":"No");

    }
    public static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
