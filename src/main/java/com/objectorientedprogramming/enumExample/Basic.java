package com.objectorientedprogramming.enumExample;

public class Basic {
    enum Month implements A {
        January, February, March, April, May, June, July, August, September, October, November, December;


        @Override
        public void display() {
            System.out.println("hi im interface");

        }


        //Month(){  //internally constructor obj like : public static final Month month = new Month();
        //    System.out.println("To get access to all values one constructor is enough for object and one object is enough explicitly "+this);
        //}
    }

        public static void main(String[] args) {

            Month month;
            month = Month.September;


            month.display();

            //System.out.println(month);

            for(Month calendar : Month.values()){
                System.out.println(calendar);
            }

            System.out.println(month.ordinal());

        }



}
