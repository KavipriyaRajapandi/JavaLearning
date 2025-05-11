package com.AllJavaConceptsImportantPractice.Part1.Interview_Question;

public class question1 {
    public static void main(String[] args) {
        byte a = 10;
        {
            a=100;
            System.out.println(a);
        }
        a=127;
        System.out.println(a);
    }
}
