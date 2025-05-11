package com.JavaQspiders.String.Problem;

/*
Input: s = “The quick brown fox jumps over the lazy dog”
Output: true
Explanation: The input string contains all characters from ‘a’ to ‘z’.
 */

import java.util.Scanner;

public class CheckPangram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "ThE qUicK BrOWn fOX JumPS OVer tHE LaZY dOG";
        if(isPangram(s)){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not a Pangram");
        }
    }
    public static boolean isPangram(String s){
        s = s.toUpperCase();
        boolean [] letters = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char present =  s.charAt(i);
           if(present>='A' && present<='Z'){
               letters[present-65]=true;
           }
        }
        for (int i = 0; i <letters.length; i++) {
            if(letters[i] == false){
                return false;
            }
        }
        return true;
    }
}
