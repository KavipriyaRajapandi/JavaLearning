package com.SDEsheet.Mathematical;

import java.util.Scanner;

public class EuclideanGcdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        while(a>0 && b>0){
            if(a>b){
                a = a %b;
            }
            else{
                b = b % a;
            }
        }
        if(a==0){
            System.out.println("Gcd is "+b);
        }
        else{
            System.out.println("Gcd is "+a);
        }
    }
}
