package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;
/*
21. Strong Number or Peterson Number
Input: A number (e.g., 145)
Output: "Strong Number" if the sum of the factorial of its digits equals the number, otherwise "Not a Strong Number".
Example:
Input: 145
Steps: 1! + 4! + 5! = 1 + 24 + 120 = 145
Output: "Strong Number"
 */

import java.util.Scanner;

public class StrongNumberPeterson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while(num>0){
            int last = num%10;
            int fact = factorialOfNumber(last);
            sum = sum + fact;
            num/=10;
        }

        if(temp==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }

    }
    public static int factorialOfNumber(int num){
        int prod = 1;
        for (int i = 1; i <=num; i++) {
            prod = prod*i;
        }
        return prod;
    }
}
