package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

/*
1. Palindrome or Not
Input: A number (e.g., 121)
Output: "Palindrome" if the number reads the same backward and forward, otherwise "Not a Palindrome".
Example:
Input: 121
Output: "Palindrome"

 */
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int temp = num;
        int palindrome = 0;

        while(num>0){
            int lastDigit = num%10; // 1*10 = 10 +2 12 12*10 = 120 + 1
            palindrome = palindrome*10 + lastDigit;
            num/=10;
        }
        if(temp==palindrome) {
            System.out.print("Given Number is Palindrome");
        }else{
            System.out.println("Given Number is Not Palindrome");
        }
    }
}
