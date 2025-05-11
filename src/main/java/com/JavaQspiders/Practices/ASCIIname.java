package com.JavaQspiders.Practices;

import java.util.Scanner;

class ASCIIname{

    //global area
    public static void main(String[] args)
    {
        //local area
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int ip = sc.nextInt();

        if(ip == 1){
            System.out.println("YOUR char: ");
            char ch = sc.next().charAt(0);

            int a  = ch; 
            System.out.println(a);
        }
        if(ip == 2){
            System.out.println("Enter your name: ");
            String res = sc.next();

            System.out.println("Your name is: "+res);
        }
        if(ip == 0){
            System.out.println("Invalid value");
        }

    }
}
