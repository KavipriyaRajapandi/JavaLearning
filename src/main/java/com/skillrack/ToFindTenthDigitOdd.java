package com.skillrack;

import java.util.Scanner;

public class ToFindTenthDigitOdd {
    // 92 87 22 33 192 182 920 1929 11 17--> this odd or not 28 98
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long num = sc.nextInt();
//        long tenthDigit = (num / 10)%10;
//        System.out.println(tenthDigit);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long num2 = sc.nextInt();
        System.out.print((num2/1000000)%10+"\n");
        System.out.println("             ");
        if (((num/10)%10) % 2 != 0 ){
            System.out.println("yes");
        }
        else {
            System.out.print("no");
        }
    }
}
