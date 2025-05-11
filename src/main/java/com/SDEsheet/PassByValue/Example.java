package com.SDEsheet.PassByValue;

public class Example {
    public static void main(String[] args) {
        int a = 10;
        callbyvalue(a);
        System.out.println(a);//why here 10 after method call finished it should be 20 because a updated to 20 ?

    }
    public static void callbyvalue(int a){
        System.out.println(a);
        a += 5;
        System.out.println(a);
        a += 5;
        System.out.println(a);
    }
}
