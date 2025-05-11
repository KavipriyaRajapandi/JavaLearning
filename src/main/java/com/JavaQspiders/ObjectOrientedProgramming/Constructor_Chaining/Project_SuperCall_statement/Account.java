package com.JavaQspiders.ObjectOrientedProgramming.Constructor_Chaining.Project_SuperCall_statement;
class Bank{
    String bname;
    String branch;
    Bank(String bname,String branch){
        this.bname = bname;
        this.branch = branch;
    }

    public void detailsOfBank(){
        System.out.println("Bank Name:"+bname);
        System.out.println("Bank Branch:"+branch);
        System.out.println("                 ");
    }
}
public class Account extends Bank {
    String acc_holder_name;
    String acc_no;
    String type;

    Account(String bname,String branch,String acc_holder_name,String acc_no,String type){
        super(bname,branch);
        this.acc_holder_name = acc_holder_name;
        this.acc_no = acc_no;
        this.type = type;
    }

    public void detailsOfAccount(){
        System.out.println("Bank name:"+bname);
        System.out.println("Bank branch:"+branch);
        System.out.println("Account Holder Name:"+acc_holder_name);
        System.out.println("Account Number:"+acc_no);
        System.out.println("Account Type:"+type);
        System.out.println("                 ");
    }

    public static void main(String[] args) {
        Account ref1 = new Account("ICICI","Mogappair","Sibi Varshaan","143EB12","Debit Card");
        ref1.detailsOfAccount();
    }
}
