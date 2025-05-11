package com.AllJavaConceptsImportantPractice.Part1.Swapping;

public class Swap3NumbersWithoutUsingTemp {
    public static void main(String[] args) {
        int a = 73;
        int b = 19;
        int c = 125;

        //arithmeticOp(a,b,c);
        //BitWiseXOR(a,b,c);
        UsingArray(a,b,c);
    }
    public static void arithmeticOp(int a,int b,int c){
        a = a + b + c;
        b = a - (b + c);
        c = a - (b+c);
        a = a - (b+c);

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }

    public static void BitWiseXOR(int a,int b,int c){
        a = a ^ b ^ c;
        b = a ^ b ^ c;
        c = a ^ b ^ c;
        a = a ^ b ^ c;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);

    }

    public static void UsingArray(int a,int b,int c){
        int[] arr = {a,b,c};
        //case 1:
        a = arr[1];
        b = arr[2];
        c = arr[0];
        //case2:
        /*
        a = arr[2];
        b = arr[0];
        c = arr[1];
         */
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }


}
