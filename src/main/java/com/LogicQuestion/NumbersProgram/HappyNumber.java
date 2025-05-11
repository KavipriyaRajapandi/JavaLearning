package com.LogicQuestion.NumbersProgram;

/*
A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of
its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.

Input: n = 19
Output: True
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: False
 */

import java.util.Scanner;

public class HappyNumber {

    public static boolean happyNumber(int n){ //19

        int x = n;
        int sum = n;

        while(sum > 9){
            sum=0;

            while(x > 0){
                int lastDigit = x % 10; // 9 //0
                sum += lastDigit*lastDigit; // 0 + 0 * 0
                x /= 10;//1 // 10
            }
            x = sum;
        }
        if(x == 1 || x == 7){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (happyNumber(num)) {
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy number");
        }
    }
}
