package com.JavaQspiders.ObjectOrientedProgramming.Constructor.thisKeyword;

public class Bank {
    String name;
    String branch;

    public Bank(String name,String branch){
        //L.I
        /*
        -this is a keyword
        -it contains current executing address (b1)-> Book@123
        -this keyword not prefixed with modifiers
        -suggested to use this keyword whenever local and global variable has same name

        sout(this) -> current accessing address of the obj
         */
        this.name = name;//Programmer Written Instruction
        this.branch = branch;//PWI
    }

    public void bankDetails(){
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
        System.out.println(this);
        System.out.println("     ");
    }
}
