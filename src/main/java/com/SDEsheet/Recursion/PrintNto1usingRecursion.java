package com.SDEsheet.Recursion;

import java.util.Scanner;

public class PrintNto1usingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Value:");
        int n = sc.nextInt();

        print1toN(n);
    }
    public static void print1toN(int n){

        if(n>0){
            System.out.println(n);
            n--;
            print1toN(n);
        }
    }
}
