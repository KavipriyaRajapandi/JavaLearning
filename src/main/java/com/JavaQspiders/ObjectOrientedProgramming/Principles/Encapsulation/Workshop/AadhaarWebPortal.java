package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.Workshop;

import java.util.Scanner;

public class AadhaarWebPortal {
    private static long adminPassword = 1007;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AadhaarCard c1 = new AadhaarCard("SibiVarshaan",789123,"mogappair",123);
        AadhaarCard c2 = new AadhaarCard("SivaShree",456123,"jammu",456);
        AadhaarCard c3 = new AadhaarCard("Sumitha",123789,"koyambedu",789);

        boolean flag = true;
        do{
            System.out.println("\t\t\tWelcome");
            System.out.println("\t\t\tWhat do you want to do with your Aadhar Card");
            System.out.println("1.Get Info\n2.Set Info\n3.Exit");
            System.out.println("Enter which option you want to select");
            int inp = sc.nextInt();
            switch (inp){
                case 1: {
                    System.out.println("\t\t\tFor which person you want to get the details:");
                    System.out.println("\t\t\t1."+c1.getName()+"\n\t\t\t2."+c2.getName()+"\n\t\t\t3."+c3.getName()+"\n\t\t\t4.Exit");
                    System.out.println("Before accessing enter admin password:");
                    long pass = sc.nextLong();
                    if(adminPassword==pass){
                        System.out.println("Access Given");
                        System.out.println("\t\t\tEnter which person you want to select");
                        int person = sc.nextInt();
                        switch (person){
                            case 1: {
                                c1.detailsOfAadhaarCard();
                                break;
                            }
                            case 2 :{
                                c2.detailsOfAadhaarCard();
                                break;
                            }
                            case 3:{
                                c3.detailsOfAadhaarCard();
                                break;
                            }
                            case 4: {
                                System.out.println("\t\t\tRedirecting to Main Page");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("\t\t\tFor which person you want to Modify the Details:");
                    System.out.println("\t\t\t1."+c1.getName()+"\n\t\t\t2."+c2.getName()+"\n\t\t\t3."+c3.getName()+"\n\t\t\t4.Exit");
                    System.out.println("Before accessing enter admin password:");
                    long pass = sc.nextLong();
                    if(adminPassword==pass){
                        System.out.println("Access Given");
                        System.out.println("\t\t\tEnter which person you want to select");
                        int person = sc.nextInt();
                        switch (person){
                            case 1: {
                                System.out.println("For "+c1.getName()+" which aadhaar details you want to change:");
                                System.out.println("\t\t\t1.Aadhaar Name\n\t\t\t2.Aadhaar Contact\n\t\t\t3.Aadhaar Address\n\t\t\t4.Exit");
                                int ip = sc.nextInt();
                                switch(ip){
                                    case 1:{
                                        if(c1.isVerification()){
                                            System.out.println("Enter the changes in name:");
                                            String newName = sc.next();
                                            c1.setName(newName);
                                            c1.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(c1.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            long newContact = sc.nextLong();
                                            c1.setContact(newContact);
                                            c1.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 3:{
                                        if(c2.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            String newAddress = sc.next();
                                            c1.setAddress(newAddress);
                                            c1.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("Redirected");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2 :{
                                System.out.println("For "+c2.getName()+" which aadhaar details you want to change:");
                                System.out.println("\t\t\t1.Aadhaar Name\n\t\t\t2.Aadhaar Contact\n\t\t\t3.Aadhaar Address\n\t\t\t4.Exit");
                                int ip = sc.nextInt();
                                switch(ip){
                                    case 1:{
                                        if(c2.isVerification()){
                                            System.out.println("Enter the changes in name:");
                                            String newName = sc.next();
                                            c2.setName(newName);
                                            c2.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(c2.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            long newContact = sc.nextLong();
                                            c2.setContact(newContact);
                                            c2.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 3:{
                                        if(c2.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            String newAddress = sc.next();
                                            c2.setAddress(newAddress);
                                            c2.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("Redirected");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("For "+c3.getName()+" which aadhaar details you want to change:");
                                System.out.println("\t\t\t1.Aadhaar Name\n\t\t\t2.Aadhaar Contact\n\t\t\t3.Aadhaar Address\n\t\t\t4.Exit");
                                int ip = sc.nextInt();
                                switch(ip){
                                    case 1:{
                                        if(c3.isVerification()){
                                            System.out.println("Enter the changes in name:");
                                            String newName = sc.next();
                                            c3.setName(newName);
                                            c3.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 2:{
                                        if(c3.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            long newContact = sc.nextLong();
                                            c3.setContact(newContact);
                                            c3.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 3:{
                                        if(c3.isVerification()){
                                            System.out.println("Enter the changes in address:");
                                            String newAddress = sc.next();
                                            c3.setAddress(newAddress);
                                            c3.detailsOfAadhaarCard();
                                        }
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("Redirected");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("\t\t\tRedirecting to Main Page");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    flag = false;
                    break;
                }
            }

        }while (flag);

        System.out.println("Thank you for Visiting Web Portal");


    }
}
