package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum += i;
            }
        }

        if(sum==num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
