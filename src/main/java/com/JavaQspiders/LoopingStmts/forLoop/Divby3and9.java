package com.JavaQspiders.LoopingStmts.forLoop;

public class Divby3and9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i%3==0 && i%9==0){
                System.out.println(i);
            }
        }
    }
}
