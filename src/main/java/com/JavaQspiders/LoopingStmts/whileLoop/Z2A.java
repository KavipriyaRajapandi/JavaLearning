package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class Z2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);
        while(inp <= 'Z' && inp >= 'A'){
            System.out.println(inp);
            inp--;
        }
    }
}
