package com.LogicQuestion.NumbersProgram.SameConcept1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for(int i = 1; i<=num/2;i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }

    }
}
