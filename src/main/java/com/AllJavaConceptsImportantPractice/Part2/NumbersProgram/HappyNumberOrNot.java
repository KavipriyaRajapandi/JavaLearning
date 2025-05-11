package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class HappyNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int sum = num;
        boolean flag = false;

        while(sum>9){
            sum=0;
            while(num>0){
                int last= num%10;
                sum += last*last;
                num/=10;
            }
            num = sum;
            if(num==1 || num==7){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }

    }
}
