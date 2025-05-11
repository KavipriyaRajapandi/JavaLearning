package com.LogicQuestion.NumbersProgram.SameConcept1;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num/2;i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a perfect Number");
        }
    }
}
