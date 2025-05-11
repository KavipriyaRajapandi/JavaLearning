package com.JavaQspiders.LoopingStmts.whileLoop;

import java.util.Scanner;

public class SumAndProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();//153
        int s = 0;
        int p = 1;
        while(num > 0){//153 > 0
            int sum = num % 10; // 153 % 10 = 3
            s += sum; // s = s + sum = 0 + 3 , s = 3
            p *= sum; // p = p * sum = 1 * 3, p = 3

            int divide = num / 10; // 15
            num = divide;



        }
        System.out.println("The sum and product of digit is "+s+" "+p);
    }
}
