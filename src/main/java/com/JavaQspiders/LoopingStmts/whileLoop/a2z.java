package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class a2z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp = 'a';

        while(inp <= 'z'){
            System.out.println(inp);
            inp++;
        }
    }
}
