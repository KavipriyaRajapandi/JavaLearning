package com.Practice.NumbersProgramExam;

/*
 1 4 5

 1! + 4! + 5! = 145
 1  + 24 + 120 = 145

 */

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
        }


    }

