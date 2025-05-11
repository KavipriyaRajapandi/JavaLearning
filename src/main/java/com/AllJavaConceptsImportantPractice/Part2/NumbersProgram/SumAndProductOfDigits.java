package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;
/*
19. Sum and Product of Digits
Input: A number (e.g., 234)
Output: The sum and product of the digits.
Example:
Input: 234
Sum: 2 + 3 + 4 = 9
Product: 2 × 3 × 4 = 24
Output: "Sum = 9, Product = 24"

 */

import java.util.Scanner;

public class SumAndProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while(num>0){
            int last = num%10;
            sum += last;
            prod *= last;
            num/=10;
        }
        System.out.println("Sum is "+sum+" and Prod is "+prod);
    }
}
