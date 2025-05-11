package com.Practice.NumbersProgramExam;

/*
1234

4321

 */

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
//        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        int n = sc.nextInt();

        /*i)*/
        while(n>0){
            int rem = n % 10;
            n /= 10;

            sum = sum * 10 + rem;

        }
//        System.out.println(sum);




//        /*ii) */while(num > 9){
//            int lastDigit = num % 10;
//            sum+=lastDigit;
//            prod = sum * 10;
//            num /=10;
//            sum = prod;
//        }
        //sum = prod + n;

        System.out.println("Reverse of num is "+sum);

    }
}
