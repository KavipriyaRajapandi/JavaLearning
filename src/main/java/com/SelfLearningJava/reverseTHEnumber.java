package com.SelfLearningJava;
import java.util.Scanner;

public class reverseTHEnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num = sc.nextInt();
        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
