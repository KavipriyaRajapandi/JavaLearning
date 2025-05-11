package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

public class WorkingWithFactorial {
    static Scanner sc = new Scanner(System.in);
    static int prod = 1; //2 //3
    static int res = 1; // 1 // 2
    static int num;


    public static void main(String[] args) {
        System.out.println("Enter the Num");
        num = sc.nextInt();
        //int res = factorialofNumber(num);
        int res = sirFactorial(num);
        System.out.println("Factorial Number is "+res);
    }

    public static int factorialofNumber(int num){
        if(prod <=num){ //  1 >= 7
            res = res * prod; // 1 * 1 = 1 // 1 * 2 = 2 // 2 * 3
            prod++; // 2 // 3
            factorialofNumber(num); // 7
        }
        return res;
    }

    public static int sirFactorial(int num){
        if(num>=2){
            res *= num--;
            sirFactorial(num);
        }
        return res;
    }


}
