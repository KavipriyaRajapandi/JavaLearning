package com.LogicQuestion.NumbersProgram.SameConcept2;

import java.util.Scanner;

public class StrongNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int fact = 1;
        int sum = 0;

        while(num > 0){
            int last = num % 10;
            for(int i = 2;i<=last;i++){
                fact = fact * i;
            }
            sum = sum + fact;
            fact = 1;
            num /= 10;
        }
        if(temp == sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }

    }
}
