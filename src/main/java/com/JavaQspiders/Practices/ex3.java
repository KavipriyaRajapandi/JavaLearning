package com.JavaQspiders.Practices;

import java.util.Scanner;

public class ex3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the input char:");

        char ch = sc.next().trim().charAt(0);

        String res = (ch >= 'A' && ch <= 'Z') ? "UpperCase" : (ch >= 'a' && ch <= 'z') ? "LowerCase" : (ch >= '0' && ch <= '9') ? "Integer" : "Special Case";

        System.out.println(res);

    }
}
