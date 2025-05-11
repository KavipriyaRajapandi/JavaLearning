package com.LogicQuestion.NumbersProgram;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int prod = 1;
        int sum = 0;
        int count;
        int i;

        for ( i = num,count = 0; i > 0;i/=10,count++) {
            //count will be updated
        }

        for(int j = num;j> 0;j/=10,prod=1){
            int last = j % 10;
            for(int k = 1;k<=count;k++){
                prod *= last;

            }
            sum += prod;

        }
        if(sum == temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }


    }
}
