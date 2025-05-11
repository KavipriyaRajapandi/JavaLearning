package com.JavaQspiders.MethodsInJava.Projects;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0,b=0;
        boolean flag = true;

        do{
            System.out.println("Welcome to Calucator Program!!");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");

            int inp = sc.nextInt();



            switch (inp){
                case 1: {
                    System.out.println("Enter the Value of a:");
                    a = sc.nextDouble();
                    System.out.println("Enter the Value of b:");
                    b = sc.nextDouble();
                    double res = addition(a, b);
                    System.out.println("Addition Result:"+res);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Value of a:");
                    a = sc.nextDouble();
                    System.out.println("Enter the Value of b:");
                    b = sc.nextDouble();
                    double res = subtraction(a, b);
                    System.out.println("Subtraction Result:"+res);
                    break;
                }
                case 3:{
                    System.out.println("Enter the Value of a:");
                    a = sc.nextDouble();
                    System.out.println("Enter the Value of b:");
                    b = sc.nextDouble();
                    double res = multiplication(a, b);
                    System.out.println("Multiplication Result:"+res);
                    break;
                }
                case 4:{
                    System.out.println("Enter the Value of a:");
                    a = sc.nextDouble();
                    System.out.println("Enter the Value of b:");
                    b = sc.nextDouble();
                    double res = division(a, b);
                    System.out.println("Division Result:"+res);
                    break;
                }

                case 5:{
                    System.out.println("Exit");
                    flag = false;
                    break;
                }
            }

        }while(flag);

    }
    public static double addition(double a,double b){
        return a+b;
    }
    public static double subtraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        return (double) a/b;
    }
}
