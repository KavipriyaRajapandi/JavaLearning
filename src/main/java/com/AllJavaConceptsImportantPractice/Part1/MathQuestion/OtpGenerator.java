package com.AllJavaConceptsImportantPractice.Part1.MathQuestion;

public class OtpGenerator {
    public static void main(String[] args) {
        //Narrowing (Explicit)
        int otp = (int)(Math.random()*9999+9999);

        System.out.println(otp);

    }
}
