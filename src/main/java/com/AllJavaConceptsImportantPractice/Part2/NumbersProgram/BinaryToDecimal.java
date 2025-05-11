package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int prod = 1;
        int sum = 0;

        while(num>0){
            int last = num%10;
            sum += prod*last;
            prod = prod*2;
            num/=10;
        }
        System.out.println("Binary to Decimal is "+sum);

    }
}
