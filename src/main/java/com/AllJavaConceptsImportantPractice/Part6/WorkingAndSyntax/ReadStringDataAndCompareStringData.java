package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

import java.util.Scanner;

public class ReadStringDataAndCompareStringData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s1 = sc.nextLine();
        System.out.println("Enter your name:");
        String s2 = sc.next();

        boolean ans = s1.equals(s2);
        System.out.println("Equal Case "+ans);

        boolean ans2 = s1.equalsIgnoreCase(s2);
        System.out.println("Equal Ignore Case "+ans2);

        if(s1.equals(s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
