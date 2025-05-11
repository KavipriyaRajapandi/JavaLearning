package com.JavaQspiders.LoopingStmts.dowhileLoop;
/*
SELECT THE INPUT
1.QSP.......----> SELECT THE INPUT: 1. JAVA 2.TESTING 3.EXIT ------. 1.PRINT TABREZ
2.SCHOOL
3.EXIT
 */
import java.util.Scanner;

public class userInp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        do{
            System.out.println("1.QSP\n2.School\n3.Exit");
            System.out.println("Enter the input:");
            int inp = sc.nextInt();
            switch(inp){
                case 1:
                    System.out.println("1.Java\n2.Testing\n3.Exit");
                    System.out.println("Select the input:");
                    int inp2 = sc.nextInt();
                    boolean flag2 = true;
                    do {
                        switch (inp2){
                            case 1:
                                System.out.println("Tabrez");
                                flag2 = false;
                                flag = false;

                                break;
                            case 2:
                                System.out.println("Harsha Sir");
                                flag2 = false;
                                flag = false;
                                break;
                            case 3:
                                System.out.println("Exit");
                                flag2 = false;
                                break;
                        }
                    }while(flag2);
                break;

                case 2:
                    System.out.println("1.Maths\n2.English\n3.Exit");
                    System.out.println("Select the input:");
                    int inp3 = sc.nextInt();

                    boolean flag3 = true;
                    do {
                        switch (inp3){
                            case 1:
                                System.out.println("Prabhu");
                                flag3 = false;
                                flag = false;
                                break;
                            case 2:
                                System.out.println("Mary");
                                flag3 = false;
                                flag = false;
                                break;
                            case 3:
                                System.out.println("Exit");
                                flag3 = false;
                                break;
                        }
                        break;
                    }while(flag3);
                    break;

                case 3:
                    flag = false;
                    System.out.println("Thank you");
                    break;
            }
        }while(flag);


    }
}
