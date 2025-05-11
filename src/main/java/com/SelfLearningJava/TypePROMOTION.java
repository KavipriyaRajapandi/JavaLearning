package com.SelfLearningJava;

public class TypePROMOTION {
    public static void main(String[] args) {
        byte a = 10;
        char b = 'a';
        short d = 1024;
        int i = 2000;
        float e = 123.456f;
        double f = 0.1234d;
        double result = (f * b) + (i / e) - (a - d);
        System.out.println((f*b)+"   "+(i/e)+"   "+(a-d));
        System.out.println(result);


        System.out.println("                               ");


        long ques1 = 293029302923923929L;
        System.out.println("    ");
        int res = (int) ques1;
        System.out.println("integer:" + ques1);
        System.out.println("long:" + res);
        System.out.println(Long.MAX_VALUE);


        System.out.println("                         ");


        //BYTE TO CHAR

        byte k = 54;
        char data = (char) k;
        System.out.println(data);

        System.out.println("                 ");

        //char to byte

        char v = 'a';
        byte data2 = (byte) v;
        System.out.println(data2);

        //double to long

        double g = 210210210212190.219219D;
        long data3 = (long)g;
        System.out.println(data3);

        byte value9 = -127;
        char data8 = (char) value9;
        System.out.println(data8);

    }


}
