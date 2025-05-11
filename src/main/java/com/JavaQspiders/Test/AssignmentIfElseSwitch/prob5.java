package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int ip = sc.nextInt();

        if(ip % 2 == 0){
            System.out.println("Even");
        }
        else if(ip % 2 == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Invalid data");
        }
    }
}
