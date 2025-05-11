package com.SDEsheet.Recursion;

import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Value:");
        int n = sc.nextInt();
        int sum = 0;
        sumofN(n,sum);
    }
    public static void sumofN(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumofN(n-1,sum+n);
    }
}
