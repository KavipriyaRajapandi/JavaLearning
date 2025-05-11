package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

/*
Perfect Number or Not
Input: A number (e.g., 28)
Output: "Perfect Number" if the sum of its divisors (excluding itself) equals the number, otherwise "Not a Perfect Number".
Example:
Input: 28
Divisors: 1, 2, 4, 7, 14
Sum: 1 + 2 + 4 + 7 + 14 = 28
Output: "Perfect Number"

 */
public class WorkingWithPerfectNumber {
    static Scanner sc = new Scanner(System.in);
    static int sum = 0;
    static int divisor = 1;
    static int num;
    static int temp;
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        temp = num;

        int res = isPerfect(num);

        if(res==temp){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }


    }
    public static int isPerfect(int num){
        if(divisor<num) {
            if (num % divisor == 0) {
                sum += divisor;
            }
        }
        divisor++;
        if(divisor>num){
            return sum;
        }
        isPerfect(num);
     return sum;
    }

}
