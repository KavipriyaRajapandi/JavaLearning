package com.LogicQuestion.NumbersProgram;

import java.util.Scanner;

public class REVERSEtheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0){ //153
            rev = rev*10 + num%10; // 3 // 35 // 351
            num = num / 10; //15 // 1 // false

        }
        System.out.println(rev);

    }
}
