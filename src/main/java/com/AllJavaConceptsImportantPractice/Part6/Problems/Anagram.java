package com.AllJavaConceptsImportantPractice.Part6.Problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Race";
        String s2 = "Care";

        boolean res = isAnagram(s1,s2);

        if(res){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
    public static boolean isAnagram(String s1,String s2){
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
