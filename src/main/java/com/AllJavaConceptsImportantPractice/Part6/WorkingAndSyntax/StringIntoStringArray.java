package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

import java.util.Arrays;

public class StringIntoStringArray {
    public static void main(String[] args) {
        String s = "SibiVarshaan";
        String[] r = s.split("");
        System.out.println(r);
        System.out.println(Arrays.toString(r));

        String p = "Sibi Varshaan is Cool";
        String[] m = p.split(" ");
        System.out.println(m);
        System.out.println(Arrays.toString(m));
    }
}
