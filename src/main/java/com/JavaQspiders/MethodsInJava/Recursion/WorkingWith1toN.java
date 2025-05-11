package com.JavaQspiders.MethodsInJava.Recursion;

import java.util.Scanner;

public class WorkingWith1toN {
    static int count = 1; //2//3//4
    static int n = 0;//5
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter the N:");
        n = sc.nextInt();
        solve();
        return;
    }

    public static void solve(){
        if(count<=n){
            System.out.println(count++);
            solve();
        }
        return;
    }
}
