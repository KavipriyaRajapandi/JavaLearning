package com.LogicQuestion.NumbersProgram;

/*
input: 1101
output: 13

 */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number:");
        int binary = sc.nextInt();
        int product = 1;
        int sum = 0;

        while(binary > 0){
            sum += binary%10 * product;
            product *= 2;
            binary /= 10;
        }
        System.out.println("Decimal Number is "+sum);
    }

}
