package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;
/*
12. Factors
Input: A number (e.g., 12)
Output: A list of all the factors of the number.
Example:
Input: 12
Output: [1, 2, 3, 4, 6, 12]
 */

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
