package com.SelfLearningJava;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            //System.out.println(i+" ");
            System.out.println("Hello World");
        }

        int n = sc.nextInt();
        int val = 1;
        while(val <= n){
            System.out.println(val+ " ");
            val++;
        }

        int z = 1;
        do{

            System.out.println("EXECUTE ONE TIME");

        }while (z != 1);
    }
}
