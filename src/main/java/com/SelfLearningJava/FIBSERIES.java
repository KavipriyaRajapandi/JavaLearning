package com.SelfLearningJava;

import java.util.Scanner;

public class FIBSERIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("YOUR range for fibonacci series:"+n);
        int a = sc.nextInt();
        System.out.println("your first input:"+a);
        int b = sc.nextInt();
        System.out.println("your second input:"+b);
        int count = sc.nextInt();
        System.out.println("enter count value:"+count);

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);

    }
}
