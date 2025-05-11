package com.Practice.NumbersProgramExam;

/*
1 2 3 4 5 6 7
 */

import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Start:");
        int start = sc.nextInt();
        System.out.println("Enter the End:");
        int end = sc.nextInt();
        int sum = 0;


        for (int i = start; i <= end; i++) { // 2 3 4 5 6 7
            if(i==0 ||i==1){
                continue;
            }
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    flag = false;
                    break;
                }

            }
            if(flag){
                sum = sum + i;

            }
        }
        System.out.println(sum);



    }
}
