package com.AllJavaConceptsImportantPractice.Part6.Problems;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Value:");
        String s = sc.nextLine();
        String res = "";
        char[] ch = s.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            res += ch[i];
        }

        if(s.equals(res)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
