package com.JavaCollege.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NON-PRIMITIVE DATA TYPES (or) Array of Objects
        String[] str = new String[4];

        for(int i = 0;i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Sibi";

        System.out.println(Arrays.toString(str));

    }
}
