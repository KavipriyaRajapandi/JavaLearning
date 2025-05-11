package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

/*
18. Neon Number
Input: A number (e.g., 9)
Output: "Neon Number" if the sum of the digits of its square equals the number, otherwise "Not a Neon Number".
Example:
Input: 9
Square: 81
Sum: 8 + 1 = 9
Output: "Neon Number"
//1 to 1000 (0,1,9)
 */
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;

        while(square>0){
            int last = square%10;
            sum += last;
            square/=10;
        }
        if(sum==num){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}
