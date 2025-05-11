package com.SelfLearningJava;
import java.util.Scanner;


public class CondTernarySop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int res = sc.nextInt();
//        if(res > 0)
//        {
//            System.out.println("POSITIVE NUMBER:" +res);
//        }
//        else{
//            System.out.println("NEGATIVE NUMBER:"+res);
//        }


        System.out.println("ENTER THE NUMBER: ");

        int number = sc.nextInt();

        String res2 = (number > 0) ? "Positive" : "Negative";

        System.out.println(res2);


//        System.out.println("Enter the Number:  ");
//
//        int num2 = sc.nextInt();
//
//        String res3 = (num2%2==0) ? "Even" : "Odd";
//
//        System.out.println(res3);
        System.out.println("enter the number:");
        int num3 = sc.nextInt();

        //NESTED CONDITIONAL OPERATOR

        String res4 = num3 > 0 ? "Postive number" : num3 < 0 ? "Negative" : "Zero";
        System.out.println(res4);

        //System.out.println("Neither positive nor negative");
    }
}
