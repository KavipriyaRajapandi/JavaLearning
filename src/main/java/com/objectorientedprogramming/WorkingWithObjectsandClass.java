package com.objectorientedprogramming;

import java.util.Arrays;

public class WorkingWithObjectsandClass {

    public static void main(String[] args){

        String[] students = new String[5];



        Students sibi = new Students(89,"sibivarshaan",87.6f);


        Students random = new Students(sibi);

        //sibi.rollno = 89;
        //sibi.name = "sibivarshaan";
        //sibi.marks = 8.76f;
        //sibi.marks = 8.79f;



        //System.out.println(sibi.rollno);
       // System.out.println(sibi.name);
       // System.out.println(sibi.marks);

       // sibi.changeName("Varshaan");
       // sibi.greetings();


        //System.out.println(random.name);

        Students random2 = new Students();

       // System.out.println(random2.marks);

        Students one = new Students();
        Students two = one;
        String three = new String();




        two.name = "sibi";

        one.name = "toby";


        System.out.println(two.name);








    }




}

class Students{


    int rollno;
    String name;
    float marks ;

    //without using this keyword we can also print and what the use of this keyword to

    void greetings(){

        System.out.println("Welcome! My name is"+ name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Students(Students other){
        this.name = other.name;
        this.rollno= other.rollno;
        this.marks= other.marks;
    }

    Students(){

        this(18,"sibivasrhaan",98.5f);

    }



    Students(int rollno,String name,float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
