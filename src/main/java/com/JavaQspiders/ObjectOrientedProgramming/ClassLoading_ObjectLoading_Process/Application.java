package com.JavaQspiders.ObjectOrientedProgramming.ClassLoading_ObjectLoading_Process;

public class Application {
    /*
    Class Loading Process execute before Object Loading Process
    when program sees constructor call it will start Load instruction which is Object Loading Process
     */
    /*
    Class Loading
    Step 1 - Block of Memory created inside the Class static area or static pool called class Block
    Step 2 - All the methods and multi Line initializers loaded inside the Method Area
    Step 3 - A Table will be created inside Class Static Area
    Step 4 - All the static members will be loaded inside the Table in Class Block
    Step 5 - All the static variables will be loaded with default values inside the class Block
    Step 6 - All the static initializer execute from Top to bottom approach
    Step 7 - Main Method will be called
     */
    static{
        //static context area
        System.out.println("\t\tWelcome to the Application");
    }

    {
        //non-static context area
        System.out.println("\t\tSetting Environment to run for application");
    }

    //states
    String app_name;
    int year;
    static String mobile = "Nokia";

    public Application(){ //Empty call constructor

    }

    public Application(String app_name,int year){
        //L.I (Load all non-static Members)
        /*
        OBJECT LOADING PROCESS:
        Step 1 - After Constructor Call in Heap area , NEW Keyword will create block of memory in Heap Area called Object Block.
        Step 2 - L.I Execute
                 *Creates a table inside the Object Block
                 *Load all non-static members inside the table
                 *all the non-static variable will be loaded with default values
                 *all the non-static initializers will be executed from Top to Bottom Approach
        Step 3 - Programmer Written Instructions will be executed
        Step 4 - Address of the Object Written by new Keyword.
         */
        this.app_name = app_name; //Programmer Written Instruction
        this.year = year; //PWI
    }

    //EXISTING CLASS EXECUTION
    public static void main(String[] args) {
        //static context area
        System.out.println("Program Starts");
        Application ref1 = new Application("PUBG",2017);
        System.out.println(ref1);
        ref1.details();
        Application ref2 = new Application("Gpay",2015);
        System.out.println(ref2);
        ref2.details();
        System.out.println("Program Ends");
    }

    public void details(){
        //Non-static Area
        System.out.println("Application Name:"+app_name);
        System.out.println("Application Release:"+year);
        System.out.println("Mobile:"+mobile);
        System.out.println("              ");
    }

}
