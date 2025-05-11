package com.JavaQspiders.MethodsInJava.Working;

public class FindingPowerRecursion {
    public static void main(String[] args) {
        int k = 4;
        int n = 2;
        int res = pow(n,k);
        System.out.println("Power of given "+n+" times "+k+" is "+res);
    }
    public static int pow(int n,int k){
        if(k==0){
            return 1;
        }
        return pow(n,k-1)*n;
    }
}
