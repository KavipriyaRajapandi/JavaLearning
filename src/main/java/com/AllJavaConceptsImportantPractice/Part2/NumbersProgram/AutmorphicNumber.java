package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class AutmorphicNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String temp = ""+num;
        long i;
        long count;

        long square = num*num;
        String conc = "";

        for (i = num,count = 0;i>0; i/=10,count++) {

        }
        while(count >0){
            long last = square%10;
            conc = last + conc;
            square/=10;
            count--;
        }

        if(temp.equals(conc)){
            System.out.println("AutoMorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}
