package com.JavaQspiders.MethodsInJava.Working;

public class OptimizedPowerRecursion {
    public static void main(String[] args) {
        int k = 5;
        int n = 2;
        int res = pow(n,k);
        System.out.println("Power of given "+n+" times "+k+" is "+res);
    }
    public static int pow(int n,int k){
        if(k==0){
            return 1;
        }
        if(k%2==1) {
            int oddHalfPower = pow(n,(k-1)/2);
            return n*oddHalfPower*oddHalfPower;
        }
        int evenHalfPower = pow(n,k/2);
        return evenHalfPower*evenHalfPower;

    }
}
