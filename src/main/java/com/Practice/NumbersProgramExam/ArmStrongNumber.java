package com.Practice.NumbersProgramExam;

/*
153

1*1*1 + 5*5*5 + 3*3*3 (25*5)
1 + 125 + 27 = 145 + 8 = 153
 */

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int count;
        int i;
        int sum=0;
        int prod = 1;

        //First to find count for this given input
        for(i=num,count=0;i>0;i/=10,count++){
            //count = 3
        }

        for(int j=num;j>0;j/=10,prod=1){
            int lastDigit = j%10;
            for (int k = 1; k <=count ; k++) {
                 prod *= lastDigit;

            }
            sum += prod;
        }

        if(sum==temp){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not ArmStrong Number");
        }

    }
}
