package com.JavaQspiders.MethodsInJava.Problems;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Program");
        System.out.println("               ");
        System.out.println("Value of a:");
        int a = sc.nextInt();
        System.out.println("Value of b");
        int b = sc.nextInt();
        System.out.println("Value of c");
        int c = sc.nextInt();
        largestThreeNum(a,b,c);
        System.out.println("             ");
        System.out.println("Bye from Program");
    }

    public static void largestThreeNum(int a,int b,int c){

        if(a==b && b==c){
            System.out.println("All are equal");
        }
        else if(b>a && b>c){
            System.out.println("B is greater than A and C");
        }
        else if(a>b && a>c){
            System.out.println("A is greater than B and C");
        } else if (c>b && c>a) {
            System.out.println("C is greater than B and A");
        }
        else{
            System.out.println("Invalid");
        }
        return;
    }
}
