package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;
/*
 Perfect Square or Not
Input: A number (e.g., 49)
Output: "Perfect Square" if the number is the square of an integer, otherwise "Not a Perfect Square".
Example:
Input: 49
Output: "Perfect Square"

 */

import java.util.Scanner;

public class PerfectSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sqrt = (int)Math.sqrt(num);
//        if((sqrt*sqrt)==num){
//            System.out.println("Perfect Square");
//        }
        if(Math.sqrt(num)%1==0){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not Perfect Square");
        }
        numSquares(12);
    }

    public static int numSquares(int n) {
        int sum = 0;
        int count = 0;
        for(int i=2;i<n;i++){
            if(Math.sqrt(i)%1==0){
                count++;
                sum += i;
                i--;
                if(sum==n){
                    return count;
                }
            }
        }
        return count;
    }
}
