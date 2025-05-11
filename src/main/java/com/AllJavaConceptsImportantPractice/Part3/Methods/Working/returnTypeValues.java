package com.AllJavaConceptsImportantPractice.Part3.Methods.Working;

public class returnTypeValues {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        swap(a,b);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
        int a = 10;
        passbyvalue(a);
//        System.out.println(a);

//        int res  = valuereturn(10);
//        System.out.println(res);
    }
    public static void passbyvalue(int a){
        System.out.println(a);
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static int valuereturn(int a){
        return a;
    }
}
