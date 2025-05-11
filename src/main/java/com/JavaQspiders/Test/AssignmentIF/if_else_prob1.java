package com.JavaQspiders.Test.AssignmentIF;


import java.util.Scanner;

public class if_else_prob1 {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if(year % 2 == 0) {
            System.out.println("Leap Year");
        }
        if(year % 2 == 1){
            System.out.println("Not Leap year");
        }

    }

}

