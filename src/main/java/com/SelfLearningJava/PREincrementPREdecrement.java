package com.SelfLearningJava;

//PREFIX AND THE POSTFIX FROM THE INCREMENT AND DECREMENT OPERATOR IS ++n,n++ , --n,n--

public class PREincrementPREdecrement {
    public static void main(String[] args){
        int a = 10; //11
        int b = 20;

        a=a++;
        //System.out.println(a++ + a); //10
        System.out.println(a);
        a=a++;
        System.out.println(a);
        a=a++;
        System.out.println(a);
        a=a++ + b + a;
        System.out.println(a);

    }


}
