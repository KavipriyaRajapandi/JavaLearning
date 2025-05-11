package com.JavaQspiders.MethodsInJava.Recursion;
/*
Input: A decimal number (e.g., 10)
Output: The binary equivalent of the decimal number.
Example:
Input: 10
Output: "1010"
 */

import java.util.Scanner;

public class WorkingWithDecimalToBinary {
    static Scanner sc = new Scanner(System.in);
    static int num = 0;
//    static String concat=" ";
    static String res2 = " ";
    static String res;

    public static void main(String[] args) {
        System.out.println("Enter the Decimal Number:");
        num = sc.nextInt();
        res = decimalToBinary(num);
        if(num != 0) {
            System.out.println("Binary Number of "+num+" is "+res);
        }
    }

    public static String decimalToBinary(int num) {

        if (num > 0) {
            int lastDigit = num % 2;
            num /= 2;
            decimalToBinary(num);
                res2 = lastDigit + res2;
        }

        return res2;
    }
}
