package com.LogicQuestion.NumbersProgram;

/*
1 2 3 4

Add First and Last Number: 1 + 4 = 5
Add In between Number: 2 + 3 = 5

if(first&last == inbetween){
XylumNumber
}
 */

import java.util.Scanner;

public class XylemNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //1234
        int firstLastSum = 0;
        int InbetweenSum = 0;
        int lastDigit = num % 10;
        firstLastSum = firstLastSum + lastDigit;
        num/=10;
        for(int i = 1;i<=num;i++){
            if(num > 9){
                int secondLast = num % 10; // 3
                InbetweenSum = InbetweenSum +secondLast;
                num/=10;
            }
            else if(num<9){
                firstLastSum = firstLastSum + num;
                num/=10;
            }
        }
        if(firstLastSum == InbetweenSum){
            System.out.println("Xylem Number");
        }
        else{
            System.out.println("Phloem Number");
        }
    }
}
