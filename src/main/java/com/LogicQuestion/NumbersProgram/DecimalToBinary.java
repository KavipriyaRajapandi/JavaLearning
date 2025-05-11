package com.LogicQuestion.NumbersProgram;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        String ans ="";

        while(num > 0){
            ans = num%2 + ans;
            num = num/2;
        }
        System.out.println(ans);
    }
}
