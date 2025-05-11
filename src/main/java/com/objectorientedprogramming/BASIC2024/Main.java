package com.objectorientedprogramming.BASIC2024;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] rno = new int[5];
        String[] name = new String[5];
        double[] marks = new double[5];

        Student[] student = new Student[5];



       // System.out.println(Arrays.toString(student));

        Student sibi = new Student(89,"Sibi Varshaan",88.9);
        Student charles = new Student(78,"charles",98.8);

        //Student sibi = new Student(12,"turner",90);

        charles.changeName("sibi");

//        System.out.println(sibi.rno);
//        System.out.println(sibi.name);
//        System.out.println(sibi.marks);
//
//        System.out.println(charles.name);

        Student random = new Student(charles);

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random2 = new Student();


        System.out.println(random2.name);

        Student one = new Student();

        Student two = one;

        one.name = "jijao";

        System.out.println(two.name);



    }
}

class Student{
    int rno;
    String name;
    double marks;



    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void changeName(String newName){
        name = newName;
    }


    void greeting(){
        System.out.println("Hi my name is "+name);
    }

    Student(){
        this(12,"sivashree",89.9);
    }


    Student(int rno,String name, double marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
