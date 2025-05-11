package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

public class ReplaceCharInString {
    public static void main(String[] args) {
        String s = "Sibixarshaan";
        String r = s.replace('x','V');
        System.out.println(s);
        System.out.println(r);
        System.out.println(r.replace('V','G'));
    }
}
