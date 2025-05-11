package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part1;

public class FindingPowerRecursion {
    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        int pow = powerOf(n,k);
        System.out.println(n+" Power of given "+k+" is "+pow);
    }
    public static int powerOf(int num,int k){
        if(k==0){
            return 1;
        }
        return powerOf(num,k-1)*num;
    }
}
