package com.JavaQspiders.ArrayConcepts.Working;

/*
Array is a Linear Data Structure (or) continuous memory block which is used to store Homogeneous elements.
2 Ways:
Dynamic Way
Static Way

This Syntax for Dynamic Syntax

 */

public class DynamicSyntax {
    public static void main(String[] args) {
        //datatype[]variable_name; -- D stmt
        //datatype[]variable_name = new datatype[size]; -- D & I stmt
        //variable_name = new datatype[size]; ---- I stmt

        int[] a = new int[4];
        double[] b = new double[5];
        String[] c = new String[3];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);

        System.out.println(a[0]);
        System.out.println(b[3]);
        System.out.println(c[1]);

        a[2] = 16;
        b[3] = 3.14;
        c[1] = "Java";

        System.out.println(a[2]);
        System.out.println(b[3]);
        System.out.println(c[1]);
    }

}
