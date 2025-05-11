package com.JavaQspiders.String.Working;

import java.util.Scanner;

public class ScannerAndEqualsMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String S1:");
        String s1 = sc.nextLine();
        System.out.print("Enter the String S2:");
        String s2 = sc.nextLine();

        System.out.print(s1.equals(s2));
        System.out.print(s1.equalsIgnoreCase(s2));
    }
}
