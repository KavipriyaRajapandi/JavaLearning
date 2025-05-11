package com.JavaQspiders.ObjectOrientedProgramming.Constructor.thisKeyword;

public class BankObj {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI","Vadapalani");
        Bank b2 = new Bank("IOB","Arumbakkam");
        b1.bankDetails();
        b2.bankDetails();
    }
}
