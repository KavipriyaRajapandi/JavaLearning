package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program10 {
    public static void main(String[] args) {
        int a = 1;
        a = a++ + ++a * --a - a--;
        System.out.println(a);
    }
}
