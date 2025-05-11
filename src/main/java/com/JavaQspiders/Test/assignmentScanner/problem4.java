package com.JavaQspiders.Test.assignmentScanner;

import java.util.Scanner;

public class problem4 {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)throws Exception{
        System.out.println("Enter your GF NAME:");
        String gf = sc.next();
        System.out.println("Enter your gf weight:");
        int age = sc.nextInt();
        System.out.println("Enter your gf contact:");
        long contact = sc.nextLong();
        System.out.println("Enter your gf father NAME:");
        String father = sc.next();
        System.out.println("\t\t\tPROCESSING......");

        Thread.sleep(5000);
        System.out.println("\t\tDETAILS");
        System.out.println(" ");
        System.out.println("Your girl friend is:"+gf);
        System.out.println("Your gf weight is:"+age);
        System.out.println("Your gf contact is:"+contact);
        System.out.println("your gf father is:"+father);




    }
}
