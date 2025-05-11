package com.SDEsheet.Recursion;

import java.util.Scanner;

public class FactorialOfANumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        factOfNumber(n,1);
    }
    public static void factOfNumber(int n,int fac){
        if(n<1){
            System.out.println(fac);
            return;
        }
        factOfNumber(n-1,fac*n);
    }
}
