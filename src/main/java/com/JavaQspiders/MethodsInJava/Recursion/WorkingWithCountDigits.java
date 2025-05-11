package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

public class WorkingWithCountDigits {
    static Scanner sc = new Scanner(System.in);
    static int count=0;

    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int res = countDigit(num);
        System.out.println("Count of the "+num+" is "+res);
    }
    public static int countDigit(int x){
            int lastDigit = x % 10;
            if (x!=0) {
                if(lastDigit<=9) {
                    count++;
                }
            }
            x /= 10;
            if(x==0){
                return count;
            }
            countDigit(x);

        return count;
    }
}
