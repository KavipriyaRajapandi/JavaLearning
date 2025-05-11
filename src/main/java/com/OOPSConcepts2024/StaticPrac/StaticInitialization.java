package com.OOPSConcepts2024.StaticPrac;

public class StaticInitialization {
    static int a = 10;
    static int b;

    static {//one time executes
        System.out.println("this is static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticInitialization obj = new StaticInitialization();

        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        b = b + 3;

        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        StaticInitialization obj2 = new StaticInitialization();

        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);
    }

}
