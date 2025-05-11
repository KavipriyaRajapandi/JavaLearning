package com.LogicQuestion.NumbersProgram;

/*
input:
start - 1
end - 10

output:
2 3 5 7

sum of prime = 2 + 3 + 5 + 7
 */

import java.util.Scanner;

public class PrimeNumbersInRANGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the Start:");
        int start = sc.nextInt();
        System.out.println("Enter the End:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) { //start
            if(i==0 || i==1){
                continue;
            }
            boolean flag = true;
            for (int j = 2; j < i; j++) { //i==
                if(i % j == 0){
                    flag = false;
                    break;
                }

            }
            if(flag){
                //System.out.println("Prime");
                sum = sum + i;

            }


        }
        System.out.println("Sum of Prime Numbers is "+ sum);




    }
}
