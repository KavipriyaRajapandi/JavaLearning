package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

/*
16. Factorial of a Number
Input: A number (e.g., 5)
Output: The factorial of the number.
Example:
Input: 5
Steps: 5 × 4 × 3 × 2 × 1 = 120

 */
public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");
        int num = sc.nextInt();
        int prod = 1;
        while(num>0){
            prod *= num;
            num--;
        }
        System.out.println("Factorial of a Number"+prod);
    }
}
