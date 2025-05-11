package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Starts.....");
        System.out.println("Enter the Number:");
        int inp = sc.nextInt();

        if(inp == 0){
            System.out.println("Zero");
        }
        else if(inp > 0) {
            System.out.println("Positive");
        }
        else if(inp < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Invalid data");
        }
        System.out.println("Program Ends.");
    }
}
