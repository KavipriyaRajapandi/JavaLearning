package com.JavaQspiders.ObjectOrientedProgramming.Constructor;

public class WhyConstructor {
    //states
    int sid;
    String sname;
    double marks;
    //states and SLSI
    static String school = "xyz";
    static String principal = "Shambu";

    //Behaviour
    public void detailsOfStudents(){
        System.out.println("Student name:"+sname);
        System.out.println("Student Id:"+sid);
        System.out.println("Student Marks:"+marks);
        //can access static variable inside non-static area
        System.out.println("Student School Name:"+school);
        System.out.println("School Principal:"+principal);
    }
}
