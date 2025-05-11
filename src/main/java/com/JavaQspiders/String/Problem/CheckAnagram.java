package com.JavaQspiders.String.Problem;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd String:");
        String s2 = sc.nextLine();

        boolean res = anagram(s1,s2);
        System.out.println("**************");
        if(res){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }

    }

    public static boolean anagram(String s1,String s2){

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        s1 = new String(a);
        s2 = new String(b);

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
