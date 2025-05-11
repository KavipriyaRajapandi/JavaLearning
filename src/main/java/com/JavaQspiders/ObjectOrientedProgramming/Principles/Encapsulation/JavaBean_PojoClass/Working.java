package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.JavaBean_PojoClass;

public class Working {
    /*
    Java Bean Class or Pojo Class
    -class should be public
    -All the Data members should be private
    -It should be public no argument constructor
    -should have public getters and setters
     */
    private String name;
    private int age;

    Working(){

    }

    //getters
    public String getName(){
        return name;
    }
    public int getId(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }
}
