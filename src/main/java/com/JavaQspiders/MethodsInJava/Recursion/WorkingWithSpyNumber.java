package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

/*
Spy Number
Input: A number (e.g., 1124)
Output: "Spy Number" if the sum of its digits equals the product of its digits, otherwise "Not a Spy Number".
Example:
Input: 1124
Sum: 1 + 1 + 2 + 4 = 8
Product: 1 * 1 * 2 * 4 = 8
Output: "Spy Number"
 */
public class WorkingWithSpyNumber {
    static Scanner sc = new Scanner(System.in);
    static int num = 0;
    static int sum=0;
    static int prod=1;

    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        boolean res = spyNumber(num);
        if(res==true){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }

    public static boolean spyNumber(int num){
        if(num>0){
            int lastDigit = num %10; // 4
            sum += lastDigit;
            prod *= lastDigit;
            num /= 10;
            spyNumber(num);
        }
        if(sum!=prod){
            return false;
        }
        return true;
    }
}
