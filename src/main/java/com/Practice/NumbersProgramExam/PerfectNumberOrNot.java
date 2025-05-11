package com.Practice.NumbersProgramExam;
/*
6
divisors of 6 is

1 2 3
1 + 2 + 3 = 6
 */

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<num;i++){
            if(num % i==0){
                sum = sum + i;
            }
        }
        if(num==sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}
