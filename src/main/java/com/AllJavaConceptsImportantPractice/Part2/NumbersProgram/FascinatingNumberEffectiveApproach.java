package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

/*
we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

If the given number is a 3 or more than three-digit
If the value getting after concatenation contains all digits from 1 to 9, exactly once.
 */

import java.util.Scanner;

public class FascinatingNumberEffectiveApproach {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int mul2 = num*2;
        int mul3 = num*3;
        String conc = num + "" + mul2 + mul3;

        boolean found = true;

        for (char ch = '1'; ch<='9' ; ch++) {
            int count = 0;
            for(int i=0;i<conc.length();i++) {
                char c = conc.charAt(i);
                if (ch == c) {
                    count++;
                }
            }
            if(count>1 || count ==0){
                found = false;
                break;
            }
        }
        if(found){
            System.out.println("Fascinating Number");
        }
        else{
            System.out.println("Not a Fascinating Number");
        }

    }
}
