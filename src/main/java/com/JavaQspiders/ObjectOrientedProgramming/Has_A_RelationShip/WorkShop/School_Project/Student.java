package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.WorkShop.School_Project;

public class Student {
    private String name;
    private int marks;
    private String section;

    private Student(String name,int marks,String section){
        this.name = name;
        this.marks = marks;
        this.section = section;
    }

    //getter
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public String getSection(){
        return section;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public static Student getObject(String name,int marks,String section){
        return new Student(name,marks,section);
    }
}
