package com.JavaQspiders.MethodsInJava.Problems;

import java.util.Scanner;

public class LargestOfTwoNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Program");
        System.out.println("               ");
        System.out.println("Value of a:");
        int a = sc.nextInt();
        System.out.println("Value of b");
        int b = sc.nextInt();
        largestTwoNum(a,b);
        System.out.println("             ");
        System.out.println("Bye from Program");
    }

    public static void largestTwoNum(int a,int b){

        if(a==b){
            System.out.println("Both are equal");
        }
        else if(a<b){
            System.out.println("B is greater");
        }
        else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("Invalid");
        }
        return;
    }

}
