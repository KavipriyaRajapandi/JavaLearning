package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class oneTohundredOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start:");
        int start = sc.nextInt();
        System.out.println("Enter the end:");
        int end = sc.nextInt();

        while(start <= end){
            if(start % 2 == 1){
                System.out.println(start);
            }
            start++;
        }
    }
}
