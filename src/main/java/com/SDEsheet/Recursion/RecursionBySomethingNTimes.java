package com.SDEsheet.Recursion;

public class RecursionBySomethingNTimes {
    public static void main(String[] args) {
        String s = "Sibi";
        int n = 5;
        ntimes(s,n);
    }
    public static void ntimes(String s,int n){
        if(n>0){
            System.out.println(s);
            n--;
            ntimes(s,n);
        }
    }
}
