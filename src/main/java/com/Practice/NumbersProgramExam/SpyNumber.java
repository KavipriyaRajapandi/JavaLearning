package com.Practice.NumbersProgramExam;

/*
123

1*2*3 = 6
1+2+3 = 6

6 = 6
spy number
 */

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;

        while(num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            product *= lastDigit;
            num /= 10;
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}
