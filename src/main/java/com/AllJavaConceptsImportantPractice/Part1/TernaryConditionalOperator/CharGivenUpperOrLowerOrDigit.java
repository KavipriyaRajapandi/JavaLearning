package com.AllJavaConceptsImportantPractice.Part1.TernaryConditionalOperator;

import java.util.Scanner;

public class CharGivenUpperOrLowerOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = sc.next().charAt(0);

        String res = (ch>='0' && ch<='9') ? "Digits" : (ch>='A' && ch<='Z') ? "Upper Case" : "Lower Case";

        System.out.println("Given Character is "+res);
    }
}
