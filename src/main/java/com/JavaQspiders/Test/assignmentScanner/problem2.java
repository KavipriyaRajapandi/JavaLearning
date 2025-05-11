package com.JavaQspiders.Test.assignmentScanner;

import java.util.Scanner;

public class problem2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your Favorite Bike:");
        String bike = sc.next();
        System.out.println("Enter your Price:");
        long price = sc.nextLong();
        System.out.println("Enter your Color:");
        String name = sc.next();
        System.out.println("\t\t\tPROCESSING......");

        Thread.sleep(2000);
        System.out.println("\t\tFAVOURITE BIKE");
        System.out.println(" ");
        System.out.println("Your FAVORITE BIKE is:"+bike);
        System.out.println("Your PRICE is:"+price);
        System.out.println("Your COLOR is:"+name);

    }
}
