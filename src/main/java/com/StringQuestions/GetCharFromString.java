package com.StringQuestions;

import java.util.Scanner;

public class GetCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enter the Index in the String:");
        int N = sc.nextInt();
        System.out.println(str.charAt(N-1));

    }
}
