package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num = sc.nextInt();
        int N = num + 1;

        if(Math.sqrt(N)%1==0){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not a Sunny Number");
        }
    }
}
