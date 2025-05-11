package com.JavaQspiders.MethodsInJava.Working;

public class Working1 {
    public static void main(String[] args) {
        int a = 3;
        solve(a);
    }
    public static void solve(int a){
        if(a>0){
            System.out.print(a);
            solve(a-1);
        }
    }
}
