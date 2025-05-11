package com.JavaQspiders.String.Problem;

import java.util.Scanner;

public class PalindromeInStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
    public static boolean isPalindrome(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
}
