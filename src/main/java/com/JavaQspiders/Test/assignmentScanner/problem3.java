package com.JavaQspiders.Test.assignmentScanner;

import java.util.Scanner;

public class problem3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args )throws Exception {
        System.out.println("Enter your BEST FRIEND NAME:");
        String bFrnd = sc.next();
        System.out.println("Enter your friend Age:");
        int age = sc.nextInt();
        System.out.println("Enter your friend contact:");
        long contact = sc.nextLong();
        System.out.println("\t\t\tPROCESSING......");

        Thread.sleep(5000);
        System.out.println("\t\tFriend name");
        System.out.println(" ");
        System.out.println("Your best friend is:"+bFrnd);
        System.out.println("Your age is:"+age);
        System.out.println("Your friend contact is:"+contact);


    }
}
