package com.JavaQspiders.LoopingStmts.dowhileLoop;

import java.util.Scanner;

public class userInp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to access calucator");
        int inp = sc.nextInt();
        boolean calc = false;
        System.out.println("To open calculator press 1");
        switch (inp){
            case 1:
                System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Exit");
                int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Enter the first number:");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number:");
                    int b = sc.nextInt();

                    do{
                        int sum = a + b;
                        System.out.println("The sum of "+a+" and "+b+ " is "+sum);
                    }while(calc);
                    break;

                case 2:
                    System.out.println("Enter the first number:");
                    int c = sc.nextInt();
                    System.out.println("Enter the second number:");
                    int d = sc.nextInt();

                    do{
                        int sub = c - d;
                        System.out.println("The subraction of "+c+" and "+d+ " is "+sub);
                    }while(calc);
                    break;


                case 3:
                System.out.println("Enter the first number:");
                int e = sc.nextInt();
                System.out.println("Enter the second number:");
                int f = sc.nextInt();

                do{
                    int mul = e * f;
                    System.out.println("The sum of "+e+" and "+f+ " is "+mul);
                }while(calc);
                break;

                case 4:
                    do{
                        System.out.println("EXIT");
                    }while(calc);
                    break;
            }



        }



    }
}
