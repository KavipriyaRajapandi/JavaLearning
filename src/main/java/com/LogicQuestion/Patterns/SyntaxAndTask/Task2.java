package com.LogicQuestion.Patterns.SyntaxAndTask;
//<3*6>
public class Task2 {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if(true){
                    System.out.print("* ");
                }
                else{
                    System.out.println("  ");
                }
                Thread.sleep(100);

            }
            System.out.println();

        }
    }
}
