package com.JavaQspiders.Test.AssignmentIfElseSwitch;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int ip = sc.nextInt();
        System.out.println("enter the char");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("character a");
                break;
            case 'b':
                System.out.println("character b"
                );
                break;
            default:
                System.out.println("invalid character");
                break;

        }

        switch (ip){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;


            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid data");
                break;
        }
    }
}
