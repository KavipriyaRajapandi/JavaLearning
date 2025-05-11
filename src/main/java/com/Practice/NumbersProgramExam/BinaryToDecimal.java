package com.Practice.NumbersProgramExam;
/*
1101
13
 */
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BinaryValue:");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while(num>0){
            int lastDigit = num % 10; //1
            sum += lastDigit * prod; // 0 + 1*1
            prod *= 2;
            num/=10;
        }
        System.out.println(sum);
    }
}
