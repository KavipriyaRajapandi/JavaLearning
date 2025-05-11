package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class zToa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);
        while(inp <= 'z' && inp >= 'a'){
            System.out.print(inp+ " ");
            inp--;
            Thread.sleep(100);
        }
    }
}
