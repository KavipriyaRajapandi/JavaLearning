package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.SingletonClass;

public class DriverOfDataBase {
    public static void main(String[] args) {
        DataBase db1 = DataBase.getDataBase("Root","Windows");
        DataBase db2 = DataBase.getDataBase("Sibi","Linux");
        DataBase db3 = DataBase.getDataBase("Siva","Mac-os");

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);

        System.out.println(db1.getUser());
        System.out.println(db2.getUser());
    }
}
