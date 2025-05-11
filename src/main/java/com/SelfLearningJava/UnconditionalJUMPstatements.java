package com.SelfLearningJava;

public class UnconditionalJUMPstatements {
    /*
    WITHOUT A CONDITION IT JUMPS FROM ONE STATEMENT TO ANOTHER STATEMENT

    break,continue(keywords) - used in iterative statements

    break - when control reaches break, it comes out from the loop
    break also used in switch

    continue - whenever control reaches continue, it comes out only from the current iteration
     */
    public static void main(String[] args) {


        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Hii" + i);
        }
        System.out.println("bye");
    }

}
