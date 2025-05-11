package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;
/*
2. Spy Number
Input: A number (e.g., 1124)
Output: "Spy Number" if the sum of its digits equals the product of its digits, otherwise "Not a Spy Number".
Example:
Input: 1124
Sum: 1 + 1 + 2 + 4 = 8
Product: 1 * 1 * 2 * 4 = 8
Output: "Spy Number"

 */
public class SpyNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        //1124
        int sum = 0;
        int prod = 1;

        while(num>0){
            int last = num%10;
            sum += last;
            prod *= last;
            num/=10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}
