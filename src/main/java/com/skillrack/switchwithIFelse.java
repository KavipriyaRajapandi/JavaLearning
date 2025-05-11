package com.skillrack;

/*
rectify the error so it must print 'skill' if the input is 's', else the program must print 'rack'
 */

import java.util.Scanner;

public class switchwithIFelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 's':
                if (ch == 's') {
                    System.out.println("skill");
                    break;
                }
            default:
                System.out.println("rack");
                break;

        }

    }


}
