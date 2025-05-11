package com.Practice.NumbersProgramExam;

/*
Input: 19
Output: Happy Number
1*1 + 9*9 = 82
......
.....
...1*1 + 0*0 + 0*0 = 1
1 is happy Number
 */

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = num;
        boolean flag = true;

        while(sum > 9){
            sum = 0;
            while(num > 0){
                int lastDigit = num % 10; //9
                sum += lastDigit*lastDigit; // 81
                num /= 10;
            }
            num = sum;

            if(num==1 || num==7){
                flag = true;
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy Number");
        }

    }
}
