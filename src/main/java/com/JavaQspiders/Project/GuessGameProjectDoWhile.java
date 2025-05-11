package com.JavaQspiders.Project;

import java.util.Scanner;

public class GuessGameProjectDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("\t\tWelcome to Guessing Game program");
        int sys_no = (int) (Math.random() * 100);
        int attempts = 0;
        do {
            attempts++;
            System.out.println("Enter the value from(0-100):");
            int user_no = sc.nextInt();
            if (attempts == 8) {
                System.out.println("You've reached your max attempts");
                System.out.println("Here it is a sys_no " + sys_no);
                flag = false;
            } else if (user_no < sys_no) {
                System.out.println("\t\tLow");
            } else if (user_no > sys_no) {
                System.out.println("\t\tHigh");
            } else {
                System.out.println("Congrats!!You won the Game");
                System.out.println("Want to play again or exit");
                System.out.println("1.Play again\n2.Exit");
                int playagain = sc.nextInt();

                boolean flag2 = true;

                switch (playagain) {
                    case 1:
                        System.out.println("\t\tWelcome again to guessing game program");
                        int sys_no2 = (int) (Math.random() * 100);
                        int attempts2 = 0;

                        do {
                            attempts2++;
                            System.out.println("Enter the value from(0-100):");
                            int user_no1 = sc.nextInt();
                            if (attempts2 == 8) {
                                System.out.println("You've reached your max attempts");
                                System.out.println("Here it is a sys_no" + sys_no);
                                flag2 = false;
                            } else if (user_no1 < sys_no2) {
                                System.out.println("\t\tLow");
                            } else if (user_no1 > sys_no2) {
                                System.out.println("\t\tHigh");
                            } else {
                                System.out.println("\t\tCongrats!!You won the Game Again");
                            }
                        } while (flag2);
                        break;

                    case 2:
                        System.out.println("Exit the Program");
                        break;
                }
            }
        }while (flag) ;
    }
}
