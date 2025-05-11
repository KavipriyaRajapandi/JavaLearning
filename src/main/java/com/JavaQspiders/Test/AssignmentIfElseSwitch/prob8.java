package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob8 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");

        double ip = sc.nextDouble();

        System.out.println("\t\t\t PROCESSING.....");
        Thread.sleep(1000);

        if (ip > 100 || ip < 0) {
            System.out.println("INVALID");
        } else if (ip >= 70.0) {
            System.out.println("Distinction");
        } else if (ip >= 60.0) {
            System.out.println("First Class");
        } else if (ip >= 50.0) {
            System.out.println("Second class");
        } else if (ip >= 35.0) {
            System.out.println("pass");
        } else if (ip < 35.0) {
            System.out.println("Fail");
        } else {
            System.out.println("Not Attended exam");
        }
    }
}
