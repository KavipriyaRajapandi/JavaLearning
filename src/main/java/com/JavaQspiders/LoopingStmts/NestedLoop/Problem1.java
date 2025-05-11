package com.JavaQspiders.LoopingStmts.NestedLoop;

public class Problem1 {
    public static void main(String[] args) {

        for(int i = 4;i>0;i--){
            System.out.print(i+"-");
            for(char j = 'F';j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
