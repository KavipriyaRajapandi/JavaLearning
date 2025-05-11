package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program13 {
    public static void main(String[] args) {
        int x = 001;
        int y = 010; //OCTAL DIGITS RANGES FROM ( 010 , 020 ... 070)
        int z = 100;
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(i);
    }
}
