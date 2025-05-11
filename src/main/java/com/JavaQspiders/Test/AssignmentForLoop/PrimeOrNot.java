package com.JavaQspiders.Test.AssignmentForLoop;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}
