package com.AllJavaConceptsImportantPractice.Part3.Methods.Working;

import java.util.Scanner;

public class returnTypeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();

        String res = changeName(name);
        System.out.println(res);
    }
    public static String changeName(String name){
        return "Sibi Varshaan";
    }
}
