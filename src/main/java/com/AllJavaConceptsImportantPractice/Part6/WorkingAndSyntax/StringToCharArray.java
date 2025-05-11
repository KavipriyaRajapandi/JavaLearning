package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String s1 = "SibiVarshaan";
        char[] ch= s1.toCharArray();
        System.out.println(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println(s1.toCharArray());
    }
}
