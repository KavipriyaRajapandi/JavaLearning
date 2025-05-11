package com.JavaCollege;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*int n = sc.nextInt();
        boolean ans = checkPrime(n);
        System.out.println(ans);

        */

        // System.out.println("Enter the Armstrong Number:");
        int m = sc.nextInt();
        boolean ans2 = checkArmstrong(m);
        System.out.println(ans2);

        //NUMBERS FROM 100 TO 999 CHECK ARMSTRONG NUMBER
        for(int i = 100;i<= 999;i++){
            if(checkArmstrong(i)){
                System.out.println(i);


            }


        }


    }

    //ARMSTRONG NUMBER
    static boolean checkArmstrong(int x){
        int original = x; // we are going to manipulate the x variable so pass the x value to original before itself
        int sum = 0;

        while(x > 0){
            int rem = x % 10;
            x = x/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

    }
    static boolean checkPrime(int naam){
        if(naam <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= naam){
            if(naam%c==0){
                return false;

            }
            c++;
        }
        return c*c > naam;



    }
}
