package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.SingletonClass;

public class DataBase {
    /*
    Singleton class for whom we can create only one Object
    Used in Database Field
     */
    //Declared later initialize
    private static DataBase ref;

    private String user;
    private String os;

    private DataBase(String user,String os){
        this.user = user;
        this.os = os;
    }

    public String getUser(){
        return user;
    }
    public String getOs(){
        return os;
    }

    public static DataBase getDataBase(String user,String os){
        if(ref==null){
            ref = new DataBase(user,os);
        }
        return ref;
    }
}
