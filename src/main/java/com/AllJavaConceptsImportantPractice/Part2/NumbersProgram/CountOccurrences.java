package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

/*
17. Count Occurrences
Input: A number and a digit (e.g., 122333, 3)
Output: The count of the digit in the number.
Example:
Input: 122333, 3
Output: "3"

 */
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("Given Number check occurrences");
        int n = sc.nextInt();
        int count = 0;
        while (num>0){
            int last = num%10;
            if(last==n){
                count++;
            }
            num/=10;
        }
        System.out.println("Count of the occurrences is "+count);


    }
}
