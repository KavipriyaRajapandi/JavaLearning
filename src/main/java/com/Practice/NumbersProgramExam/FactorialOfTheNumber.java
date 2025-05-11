package com.Practice.NumbersProgramExam;

// 5 * 4* 3* 2* 1

import java.util.Scanner;

public class FactorialOfTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod = 1;

        for (int i = 2; i <= num; i++) {
            prod = prod * i;

        }
        System.out.println(prod);
    }
}
