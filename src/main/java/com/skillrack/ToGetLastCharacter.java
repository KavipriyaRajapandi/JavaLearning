package com.skillrack;

import java.util.Scanner;

public class ToGetLastCharacter {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String:");
         String str = sc.nextLine();

         System.out.println(str.substring(str.length() - 1));
//
//         char ch = str.charAt(2);
//
//         System.out.println(ch);
     }
}
