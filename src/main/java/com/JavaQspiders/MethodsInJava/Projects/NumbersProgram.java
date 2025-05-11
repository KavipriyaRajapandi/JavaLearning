package com.JavaQspiders.MethodsInJava.Projects;
/*
1.Prime Number
2.Palindrome
3.Factorial
4.Perfect Square
5.Exit
 */
import java.util.Scanner;
public class NumbersProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int num = 0;
        do{
            System.out.println("                        ");
            System.out.println("Enter the NumberProgram!!!");
            System.out.println("1.Prime Number\n2.Palindrome\n3.Factorial\n4.Perfect Square\n5.Exit");
            System.out.println("Enter the Input:");
            int inp = sc.nextInt();
        switch(inp){
            case 1: {
                System.out.println("Enter the Number:");
                num = sc.nextInt();
                boolean res = primeNumber(num);
                if(res){
                    System.out.println("Prime Number");
                }
                else{
                    System.out.println("Not a Prime Number");
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter the Number:");
                num = sc.nextInt();
                boolean res = palindrome(num);
                if(res){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not a Palindrome");
                }
              break;
            }
            case 3:
            {
                System.out.println("Enter the Number:");
                num=sc.nextInt();
                System.out.println("Factorial of "+num+" is "+factorial(num));
                break;
            }
            case 4:
            {
                System.out.println("Enter the Number:");
                num = sc.nextInt();
                boolean res = perfectSquare(num);
                if(res){
                    System.out.println("Perfect Square");
                }
                else{
                    System.out.println("Not a Perfect Square");
                }
                break;
            }
            case 5:
            {
                System.out.println("Thank you!!!");
                flag = false;
                break;
            }
        }
        }while (flag);
    }
    public static boolean primeNumber(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int num){
        /*
        //palindrome of 12321 is 12321
        first to get last digit 1
        rev=0;
        rev = rev*10 + num%10 //0+1
        //num/=10
        */
        int temp = num;
        int rev = 0;
        while(num > 0){
            rev = rev*10 + num%10;
            num/=10;
        }
        if(temp!=rev){
            return false;
        }
        return true;
    }
    public static int factorial(int num){
        /*
        factorial means 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
        // 1 * 2 = 2
        sum = sum + 2 = sum = 2
        // 2 * 3 = 6
        // 6 *
         */
        int prod = 1;
        for (int i = 2; i <=num ; i++) {
            prod *= i;
        }
        return prod;
    }
    public static boolean perfectSquare(int num){
        /*
        Perfect Square
        num given like 64
        we need to prove that 8 * 8 = 64
        if it is proved then perfectSquare
        to get the 8 what do to
         */
        int root = (int) Math.sqrt(num);
        if(root*root==num){
            return true;
        }
        return false;
    }
}
