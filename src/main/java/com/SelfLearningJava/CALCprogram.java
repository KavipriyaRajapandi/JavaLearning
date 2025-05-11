package com.SelfLearningJava;

import java.util.Scanner;

public class CALCprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("ENTER THE OPERATOR:");
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the 2 numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }

    }
}
