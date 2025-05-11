package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        while(ch <= 'Z'){
            System.out.println(ch);
            ch++;
        }


    }
}
