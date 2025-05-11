package com.SelfLearningJava;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max2 = Math.max(c,Math.max(a,b));

        System.out.println(max2);

        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }

        System.out.println(max);

    }
}
