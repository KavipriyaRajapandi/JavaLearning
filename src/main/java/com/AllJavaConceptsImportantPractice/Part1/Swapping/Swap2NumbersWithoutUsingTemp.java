package com.AllJavaConceptsImportantPractice.Part1.Swapping;

public class Swap2NumbersWithoutUsingTemp {
    public static void main(String[] args) {
        int a = 73;
        int b = 19;

        //arithmeticOp(a,b);
        //BitWiseXOR(a,b);
        UsingArray(a,b);

    }

    public static void arithmeticOp(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    public static void BitWiseXOR(int a,int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    public static void UsingArray(int a,int b){
        int [] arr = {a,b};
        a = arr[1];
        b = arr[0];

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
