package com.LogicQuestion.NumbersProgram;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num==0 || num==1){
            System.out.println("Neither prime nor composite");
        }
       boolean flag = true;

        for (int i = 2; i < num; i++) { // 1 2 3 4 5 6 7
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite Number");
        }

    }
}
