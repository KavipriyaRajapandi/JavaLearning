package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class WhileSyntaxExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        int a = sc.nextInt();
        while (a <= 10){
            System.out.println("Sibi");
            a++;
        }
    }
}
