package com.JavaQspiders.Test.assignmentScanner;
import java.util.Scanner;

public class problem1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Enter your Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter your Salary:");
        long sal = sc.nextLong();
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your Contact:");
        long no = sc.nextLong();
        System.out.println("\t\t\tPROCESSING......");

        Thread.sleep(2000);
        System.out.println("\t\tEMPLOYEE DETAILS");
        System.out.println(" ");
        System.out.println("Your ID is:"+id);
        System.out.println("Your SALARY is:"+sal);
        System.out.println("Your NAME is:"+name);
        System.out.println("Your NUMBER is:"+no);

    }
}
