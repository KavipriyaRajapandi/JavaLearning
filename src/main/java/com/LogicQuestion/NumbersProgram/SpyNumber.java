package com.LogicQuestion.NumbersProgram;

/*
132 ----> 1 + 3 + 2 = 6 , 1 * 3 * 2 = 6
 */

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int store1;
        int sum = 0;
        int product = 1;
        System.out.println("Enter the number:");
        int num = sc.nextInt();


        while(num != 0){
            store1 = num % 10; // 132 % 10 = 2
            sum = sum + store1; // sum = 2
            product = product * store1; // 1 * 2 = 2
            num = num / 10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}
