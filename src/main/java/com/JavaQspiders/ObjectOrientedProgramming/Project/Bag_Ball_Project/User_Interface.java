package com.JavaQspiders.ObjectOrientedProgramming.Project.Bag_Ball_Project;

import java.util.Scanner;

public class User_Interface {
    static BasketBall BB = new BasketBall();
    static TennisBall TB = new TennisBall();
    static Bag bag = new Bag();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        do{
            System.out.println("\t\t\t BAG AND BALL GAME");
            System.out.println();
            System.out.println("1.Add Ball\n2.Remove Ball\n3.Check Bag is Empty or not\n4.Show Game that can be played\n5.Exit");
            int inp = sc.nextInt();
            switch (inp){
                case 1: {
                    if(bag.isBagEmpty()){
                        System.out.println("Which Ball want to add to the Bag:");
                        System.out.println("1.TennisBall\n2.BasketBall");
                        int user_wish_inp = sc.nextInt();
                        if(user_wish_inp==1){
                            bag.addBall(TB);
                            System.out.println("Tennis Ball added to the bag");
                        }
                        else if(user_wish_inp==2){
                            bag.addBall(BB);
                            System.out.println("Basket Ball added to the bag");
                        }

                    }
                    else{
                        System.out.println("Already Ball inside the bag");
                    }
                    break;
                }
                case 2: {
                    bag.removeBall();
                    break;
                }
                case 3: {
                    System.out.println((bag.isBagEmpty())?"Yes":"No");
                    break;
                }
                case 4:{
                    bag.showGame();
                    break;
                }
                case 5: {
                    flag = false;
                    break;
                }
            }
        }while (flag);
        System.out.println("Thank You");
    }
}
