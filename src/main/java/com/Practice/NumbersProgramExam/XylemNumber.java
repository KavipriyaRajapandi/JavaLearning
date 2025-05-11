package com.Practice.NumbersProgramExam;

/*
1234
4488

 */

import java.util.Scanner;

public class XylemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = 0;
        int Inbetweensum = 0;
        boolean flag = true;
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        num/=10;
        for(int i=1;i<=num;i++){
            if(num > 9){
                int Digit = num%10;
                Inbetweensum = Inbetweensum + Digit;
                num/=10;
            }
            else if(num < 9){
                sum = sum + num;
                num/=10;
            }
        }
        if(Inbetweensum == sum){
            flag = true;
        }
        if(true){
            System.out.println("Xylem Number");
        }
        else{
            System.out.println("Pholem Number");
        }

    }

}
