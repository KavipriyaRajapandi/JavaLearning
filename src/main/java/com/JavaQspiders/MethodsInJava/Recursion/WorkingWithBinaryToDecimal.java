package com.JavaQspiders.MethodsInJava.Recursion;
import java.util.Scanner;
/*
Binary to Decimal
Input: A binary number (e.g., 1101)
Output: The decimal equivalent of the binary number.
Example:
Input: 1101
Output: "13"
 */
public class WorkingWithBinaryToDecimal {
    static Scanner sc = new Scanner(System.in);
    static int num;
    static int sum = 0;
    static int mul = 1;

    public static void main(String[] args) {
        System.out.println("Enter the Binary Number:");
        num = sc.nextInt();
        int res = binaryToDecimal(num);
        if(res!=0){
            System.out.println("Decimal Number of "+num+" is "+res);
        }
    }

    public static int binaryToDecimal(int num){
        if(num > 0){
            int lastDigit = num % 10;//1101 --> we get 1 ---> want to mul with 1 , next we get 0 want to mul with 2 , after we get 1 want to mul with 4
            sum += lastDigit*mul;
            mul *= 2;
            num /= 10;
            binaryToDecimal(num);
        }
        return sum;
    }
}
