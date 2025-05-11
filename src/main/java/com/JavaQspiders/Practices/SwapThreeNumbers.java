package com.JavaQspiders.Practices;

public class SwapThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int temp = 0;
        temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println("a:"+a+" b:"+b+" c:"+c);
    }
}
