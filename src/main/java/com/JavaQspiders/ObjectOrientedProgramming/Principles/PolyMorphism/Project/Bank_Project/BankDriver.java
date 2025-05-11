package com.JavaQspiders.ObjectOrientedProgramming.Principles.PolyMorphism.Project.Bank_Project;

public class BankDriver {
    public static void main(String[] args) {
        Bank ref1 = new Bank();
        Bank ref2 = new Sbi("Bangalore","SBI","Shivaji Nagar");
        Bank ref3 = new Icici("Chennai","ICICI","Vadapalani");

        System.out.println(ref1.rateOfInterest());
        System.out.println(ref2.rateOfInterest());
        System.out.println(ref3.rateOfInterest());
    }
}
