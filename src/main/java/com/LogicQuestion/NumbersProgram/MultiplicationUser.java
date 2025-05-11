package com.LogicQuestion.NumbersProgram;

/*
Input : 2
Output: 2 4 6 8 10 12 14 16 18 20
 */

import java.util.Scanner;

public class MultiplicationUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
                System.out.println(num*i);

        }
    }
}
