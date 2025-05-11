package com.JavaQspiders.MethodsInJava.Recursion;
import java.util.Scanner;
public class WorkingWithReverseNumber {
    static Scanner sc = new Scanner(System.in);
    static int rev=0;
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int res = reverseNumber(num);
        System.out.println("Reverse of the given "+num+" is "+res);
    }
    public static int reverseNumber(int num){
        if(num>0) {
            rev = rev*10 + num%10; // 0 * 10 + 5
            num /= 10;
            reverseNumber(num);
        }
        return rev;
    }

}
