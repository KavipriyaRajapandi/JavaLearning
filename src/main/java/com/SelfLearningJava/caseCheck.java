package com.SelfLearningJava;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().trim().charAt(0);
//
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("LOWERCASE:"+ch);
//        }
//        else{
//            System.out.println("UPPERCASE:"+ch);
//        }

        char ch2 = sc.next().trim().charAt(0);

        String result = (ch2 >= 'a' && ch2 <= 'z') ? "LOWERCASE:" + ch2 : "UPPERCASE:" + ch2;
        System.out.println(result);





    }
}
