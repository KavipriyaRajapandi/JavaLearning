package com.AllJavaConceptsImportantPractice.Part1.Swapping;

public class Swap3NumbersUsingTemp {
    public static void main(String[] args) {
        int a = 73;
        int b = 19;
        int c = 125;

        case1(a,b,c);
        case2(a,b,c);
    }
    public static void case1(int a,int b,int c){
        int temp;

        temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
    public static void case2(int a,int b,int c){
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}
