package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class DivBY3and9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int start = sc.nextInt();
        while(start <= 100){
            if(start % 3 == 0 && start % 9 == 0){
                System.out.println(start);
            }
            start++;
        }
    }
}
