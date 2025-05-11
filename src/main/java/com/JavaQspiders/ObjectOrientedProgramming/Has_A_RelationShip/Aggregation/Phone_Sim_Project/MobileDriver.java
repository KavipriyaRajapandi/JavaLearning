package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Aggregation.Phone_Sim_Project;

import java.util.Scanner;

public class MobileDriver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //first dependent class execute first so give obj for it will create in its own method
        Sim s1 = Sim.getObject("Jio","One GigaBytes per second",2000);

        Mobile m1 = new Mobile("Mi",50000,"256 GigaBytes");

        boolean flag = true;
        do{
            System.out.println("Welcome to Sim Tracker Program");
            System.out.println("\t\t\t1.isSlotEmpty\n\t\t\t2.insertSim\n\t\t\t3.removeSim\n\t\t\t4.DetailsOfMobile\n\t\t\t5.DetailsOfSim\n\t\t\t6.Exit");
            int ip = sc.nextInt();
            switch (ip){
                case 1:
                {
                    System.out.println(m1.isSlotEmpty()?"Not Present":"Present");
                    break;
                }
                case 2:{
                    m1.insertSim(s1);
                    break;
                }
                case 3:{
                    m1.removeSim();
                    break;
                }
                case 4:{
                    m1.detailsOfMobile();
                    break;
                }
                case 5:{
                    if(m1.isSlotEmpty()){
                        System.out.println("Insert Sim first to access");
                    }
                    else {
                        System.out.println("Sim operator_name:"+s1.getOperator_name());
                        System.out.println("Sim band_width:"+s1.getBand_width());
                        System.out.println("Sim price:"+s1.getPrice());
                        System.out.println("                     ");
                    }
                    break;
                }
                case 6:{
                    flag = false;
                    break;
                }
            }
        }
        while (flag);
        System.out.println("Thank You");

    }
}
