package com.LogicQuestion.Patterns.SyntaxAndTask.NewConcept;


// UPPER HALF
//i==1 j==1 1<=5 true 1<=5 true if(1<=5-1){ " " } if(2<= 5 - 1) { " " } if(3<=5-1) { " " } if(4<=5-1){ " " } j==5false ---> else{ (* ) }
//i==2 j==1 2<=5 true 1<=5 true if(1<=5-2){ " " } if(2<= 5 - 2} { " " } if(3<=5-2) { " " } ----j==4false ---> else{ (* ) } j==5 false ---> else { (* ) }
//i==3 j==1 3<=5 true 1<=5 true if(1<=5-3){ " " } if(2<= 5 - 3} ---->j==3false {(* )} ----j==4false ---> else{ (* ) } j==5 false ---> else { (* ) }
//i==4 j==1 4<=5 true 1<=5 true if(1<=5-4){ " " } --->j=2false {(* )} ---->j==3false {(* )} ----j==4false ---> else{ (* ) } j==5 false ---> else { (* ) }
//i==5 j==1 5<=5 true 1<=5 true if(1<=5-5) ---> (j==1)false {(* )} --->j=2false {(* )} ---->j==3false {(* )} ----j==4false ---> else{ (* ) } j==5 false ---> else { (* ) }

// LOWER HALF

//i==n-1 so, i==5-1 start at i==4 ; 4>=1 (TRUE) j==1 1<=5 if(1<=5-4) { (" ") } j==2 2<=5  true if(2<=5-4) --->false else { (* ) } j==3 3<=5 true if(3<=5-4) --->false else{(* )} until 5 star print
//i==n-1 so, i== 5-1 start at i==4; i-- i==3 ; 3>=1 (true) i==3 j==1 so until if(2<=5-3) { (" ") } if j==3 3<=5-3 false (* ) if(4<=5-3) false (* ) until j==5 (* )
//for 2 stars
//for 1 star


import java.util.Scanner;

public class ProperDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j<=n; j++) {
                if (j<=n-i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
