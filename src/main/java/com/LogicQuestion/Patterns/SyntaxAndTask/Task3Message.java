package com.LogicQuestion.Patterns.SyntaxAndTask;
//<5*5>
public class Task3Message {
    public static void main(String[] args) throws Exception {
        //when number of rows and number of colums equal take
        int n= 5; //odd
        //make n value odd (important)
        /*
        if n value is even
        n = 4 (unequal Split)
        we cannot get middle row and column
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
