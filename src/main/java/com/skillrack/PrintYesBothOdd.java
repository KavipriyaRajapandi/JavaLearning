package com.skillrack;

import java.util.Scanner;

public class PrintYesBothOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first input:");
        int x = sc.nextInt();
        System.out.println("Enter the second input:");
        int y = sc.nextInt();

        if(x % 2 == 1 && y % 2 == 1 ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
