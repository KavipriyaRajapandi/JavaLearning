package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class oneToHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start: ");
        int num = sc.nextInt();
        System.out.println("Enter the end: ");
        int end = sc.nextInt();

        while(num <= end){
            System.out.print(num+" ");
            num++;
        }
    }
}
