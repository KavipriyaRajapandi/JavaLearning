package com.Practice.NumbersProgramExam;

import java.util.Scanner;

public class FactorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int ans = 0;
        boolean flag = true;

        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }


    }
}
