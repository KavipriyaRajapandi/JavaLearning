package com.JavaQspiders.ObjectOrientedProgramming.Constructor;

public class SoWeDontWantToGiveDataFor100PersonOneByOne {
    public static void main(String[] args) {
        WhyConstructor s1 = new WhyConstructor();//zero constructor (default added bt compiler)
        WhyConstructor s2 = new WhyConstructor();
        //we dont have to assign values all time for local variables
        s1.sname = "Sibi";
        s1.sid = 1;
        s1.marks = 100;

        s2.sname = "Sumi";
        s2.sid = 2;
        s2.marks = 100;

        s1.detailsOfStudents();
        System.out.println("              ");
        s2.detailsOfStudents();
    }
}
