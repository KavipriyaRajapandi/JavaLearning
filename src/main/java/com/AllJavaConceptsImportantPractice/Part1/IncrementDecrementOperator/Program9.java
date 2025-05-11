package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program9 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int p = --m * --n * n-- * m--;
        System.out.println(p);
    }
}
