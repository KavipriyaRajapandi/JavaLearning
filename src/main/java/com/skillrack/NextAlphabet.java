package com.skillrack;

/*
Please fill in the blanks with code so that the program accepts an alphabet CH and prints the next alphabet of CH. Note: The value of CH cannot be z or Z.
 */

import java.util.Scanner;

public class NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch = sc.next().charAt(0);


        ++ch;

        System.out.println(ch);



    }
}
