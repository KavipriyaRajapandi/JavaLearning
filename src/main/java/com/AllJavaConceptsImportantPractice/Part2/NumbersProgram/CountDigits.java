package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Count of Given Number is "+count);
    }
}
