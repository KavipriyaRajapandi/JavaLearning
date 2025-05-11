package com.LogicQuestion.Patterns.SyntaxAndTask;
//<5*2>
public class Task1 {
    public static void main(String[] args) throws Exception {

        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(true){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
}
