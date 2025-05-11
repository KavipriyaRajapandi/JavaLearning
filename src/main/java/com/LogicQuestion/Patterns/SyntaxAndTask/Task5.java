package com.LogicQuestion.Patterns.SyntaxAndTask;

public class Task5 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    System.out.print(j+" ");
                Thread.sleep(100);
            }
            System.out.println();

        }
    }
}
