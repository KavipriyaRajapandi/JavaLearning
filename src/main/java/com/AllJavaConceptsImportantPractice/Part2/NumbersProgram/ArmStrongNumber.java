package com.AllJavaConceptsImportantPractice.Part2.NumbersProgram;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int prod = 1;
        int count;
        int i;

        //Find the count of Given Number
        for(i=num,count=0;i>0;i/=10,count++){

        }

        for(int j = num;j>0;j/=10,prod=1){
            int last = j%10;
            for (int k = 1; k <= count; k++) {
                prod *= last;
            }
            sum += prod;
        }

        if(sum==temp){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("Not a ArmStrong Number");
        }

    }
}
