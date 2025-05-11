package com.JavaQspiders.Test.AssignmentForLoop;

import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number\n Find the Factorial of it:");
        //n! = n x (n-1) x (n-2) x (n-3) -------> 4! = 4 x (4-1) x (4-2) x (4-3) = 4 x 3 x 2 x 1 = 24
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            //int fact = n * (n-i);//6 * (6-1)
            fact = fact * i;


        }
        System.out.println(fact);

    }
}
