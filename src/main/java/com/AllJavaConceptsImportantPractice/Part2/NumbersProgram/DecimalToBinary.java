package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

/*
3. Decimal to Binary
Input: A decimal number (e.g., 10)
Output: The binary equivalent of the decimal number.
Example:
Input: 10
Output: "1010"

 */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        int num = sc.nextInt();
        String res="";
        while (num>0){
            int rem = num%2;
            res = rem + res;
            num/=2;
        }
        System.out.println("Binary number for given number is "+res);
    }
}
