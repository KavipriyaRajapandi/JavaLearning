package com.LogicQuestion.NumbersProgram.SameConcept2;

import java.util.Scanner;

/*
 1 4 5

 1! + 4! + 5! = 145
 1  + 24 + 120 = 145

 */
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num == 1 || num == 2){
            int res = 1;
            if(num*res == num){
                System.out.println("Strong Number");
            }
            else{
                System.out.println("Not Strong Number");
            }
        }
        else{
            int temp = num;
            int sum = 0;
            int fact = 0;
            for(int i = 0;i<= num;i++){
                int lastDigit = num % 10;
                int result = 1;

                for(int j=2;j<=lastDigit;j++){
                    result = result * j; //120
                    fact = result; //120
                }
                if(lastDigit == 0){
                    sum = sum + 1;
                }
                else{
                    sum = sum + fact;
                }
                num/=10;
            }
            if(num == 1){
                sum = sum + num;
                if(temp == sum){
                    System.out.println("Strong number");
                }
                else{
                    System.out.println("Not Strong Number");
                }
            }
            else if(temp == sum){
                System.out.println("Strong number");
            }
            else{
                System.out.println("Not Strong Number");
            }

        }



    }

}
