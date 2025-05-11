package com.Practice.NumbersProgramExam;

// 1 2 3 4 5 6 7 8

import java.util.Scanner;

public class PrimeNumberORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        boolean flag = true;

        if(num==0 || num == 1){
            System.out.println("Not Prime");
        }

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }


    }
}
