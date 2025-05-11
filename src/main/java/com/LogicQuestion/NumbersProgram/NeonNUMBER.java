package com.LogicQuestion.NumbersProgram;

import java.util.Scanner;

public class NeonNUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int squarenum = num*num;
        while(squarenum != 0){
            int rem = squarenum % 10;
            sum = sum + rem;
            squarenum = squarenum / 10;
        }
        if(sum== num){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }

    }

}
