package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the Input");
        int a = sc.nextInt();
        System.out.println("Select the second input");
        int b = sc.nextInt();
        System.out.println("enter the num");
        int num = sc.nextInt();

        if(num % a == 0  && num % b == 0){
            System.out.println("Development");
        }
        else{
            System.out.println("Testing");
        }


    }
}
