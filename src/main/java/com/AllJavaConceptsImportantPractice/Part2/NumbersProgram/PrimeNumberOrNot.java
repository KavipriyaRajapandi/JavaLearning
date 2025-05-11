package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        boolean flag = false;

        if(num==0||num==1){
            flag = false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag = false;
                break;
            }
            else{
                flag = true;
            }
        }

        if(flag==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
}
