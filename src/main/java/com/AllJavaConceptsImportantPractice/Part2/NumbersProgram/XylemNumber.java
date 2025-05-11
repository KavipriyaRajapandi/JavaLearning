package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

/*
Xylem Number
Input: A number (e.g., 12121)
Output: "Xylem" if the sum of the extreme digits equals the sum of the middle digits, otherwise "Not Xylem".
Example:
Input: 12121
Extreme: 1 + 1 = 2
Middle: 2 + 1 + 2 = 5
Output: "Not Xylem"
 */
public class XylemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();//121
        int extremeDigits = 0;
        int meanDigits= 0;
        int last = num%10;
        extremeDigits += last;
        num/=10;
        while(num>0){
            int lastInLoop = num%10;
            if(num<=9){
                extremeDigits += lastInLoop;
                num/=10;
            }else {
                meanDigits += lastInLoop;
                num /= 10;
            }
        }
        if(extremeDigits==meanDigits){
            System.out.println("Xylem Number");
        }
        else{
            System.out.println("Phloem Number");
        }
    }
}
