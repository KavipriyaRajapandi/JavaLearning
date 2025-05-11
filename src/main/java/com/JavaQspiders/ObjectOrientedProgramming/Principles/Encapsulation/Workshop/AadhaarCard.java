package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.Workshop;

import java.util.Scanner;

public class AadhaarCard {
    private String name; //r & w
    private long contact; //r & w
    private String address; //r & w
    private long aadhaarNo; // r
    static Scanner sc = new Scanner(System.in);

    AadhaarCard(String name, long contact, String address, long aadhaarNo){
        this.name=name;
        this.contact = contact;
        this.address = address;
        this.aadhaarNo = aadhaarNo;
    }

    //getters
    public String getName(){
        return name;
    }

    public long getContact(){
        return contact;
    }

    public String getAddress(){
        return address;
    }

    public long getAadhaarNo(){
        return aadhaarNo;
    }

    //setters
    public void setName(String name){
            System.out.println("\t\t\tVerification Success");
            this.name = name;
    }

    public void setContact(long contact){
            System.out.println("\t\t\tVerification Success");
            this.contact = contact;
    }

    public void setAddress(String address){
            System.out.println("\t\t\tVerification Success");
            this.address = address;
    }

    public void detailsOfAadhaarCard(){
        System.out.println("Aadhaar Name:"+getName());
        System.out.println("Aadhaar contact:"+getContact());
        System.out.println("Aadhaar address:"+getAddress());
        System.out.println("Aadhaar Number:"+getAadhaarNo());
        System.out.println("*************");
    }

    public boolean isVerification(){
        int count = 3;
        int otp = (int)(Math.random()*9999+9999);
        while(count>0){
            System.out.print(count == 3 ? "" : count+" attempts left! ");
            System.out.print("enter otp: ");
            System.out.println(otp);
            int userOTP = sc.nextInt();
            if(userOTP==otp){
                return true;
            }
            else{
                count--;
                System.out.println("Wrong Otp -");
            }
        }
        return false;
    }


}
