package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

/*
Happy Number
Input: A number (e.g., 19)
Output: "Happy Number" if repeatedly summing the squares of its digits eventually equals 1, otherwise "Not a Happy Number".
Example:
Input: 19
Steps: 1² + 9² = 82 → 8² + 2² = 68 → 6² + 8² = 100 → 1² + 0² + 0² = 1
Output: "Happy Number"

 */
public class WorkingWithHappyNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        if(ishappyNumber(num)){
            System.out.println(num+"Happy Number");
        }
        else{
            System.out.println(num+"Not a Happy Number");
        }
    }

    public static boolean ishappyNumber(int num){
        return ishappyrecursive(num,-1);
    }

    public static boolean ishappyrecursive(int num,int seen){
        if(num==1){
            return true;
        }
        if(num==seen){
            return false;
        }
        int next = sumofSqaure(num);
        return ishappyrecursive(next,num);
    }

    public static int sumofSqaure(int num){
        if(num==0){
            return 0;
        }
        int last = num % 10;

        return (last*last)+ sumofSqaure(num/10);
    }
}
