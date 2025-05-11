package com.objectorientedprogramming.properties.inheritance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
/*
        Box obj1 = new Box();
        System.out.println(obj1.l+" "+obj1.w+" "+obj1.h);

        Box obj2 = new Box(4);
        System.out.println(obj2.l+" "+ obj2.w+" "+ obj2.h);
*/
     //   Box obj3 = new Box(4.6,2.2,9.8);                                         //  FOR PARENT CLASS WE CAN DO THESE
     //   System.out.println(obj3.l+" "+obj3.w+" "+obj3.h);

      //  Box obj4 = new Box(obj3);
      //  System.out.println(obj4.l+" "+obj4.w+" "+obj4.h);


    /*    BoxWeight obj5 = new BoxWeight();
        System.out.println(obj5.weight);

        BoxWeight obj6 = new BoxWeight();
        System.out.println(obj6.l+" "+obj6.w+" "+obj6.h);   // inherits from the parent class by using child obj because parent referencing the child and child can use it
     */
      //  BoxWeight obj7 = new BoxWeight(2.3,2.2,4.3,35.9);
      //  System.out.println(obj7.l+" "+obj7.w+" "+obj7.h+" "+ obj7.weight);


      //  BoxWeight obj8 = new BoxWeight(obj7);
       // System.out.println(obj8.l+" "+obj8.w+" "+obj8.h+" "+ obj8.weight);
        //BowWeight im trying to do copy the boxweight of other obj7

        //                     CONCEPT 3

/*
        Box box1 = new BoxWeight(4.5,23.4,23.2,8.9);
        System.out.println(box1.l+" "+ box1.w+" "+box1.h);//here weight is not accessible because box reference variable only consider their own variables l,w,h and print it and it will reference weight but wont print for BoxWeight

        BoxWeight box2 = new Box(2.4,2.3,23.2); // because child class cant give reference to the parent class and it is logically understandable this cant be done in inheritance
         //it wont go from down to top by giving values it only give values from top to bottom

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.w+" "+box3.l+" "+box3.h);


*/

        //                                                MULTI LEVEL INHERTITANCE




      //  BoxPrice box4 = new BoxPrice(4.6,6.88,7.5,4.6,3.5);
       // System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight+" "+box4.price);
/*
        BoxPrice box5 = new BoxPrice();
        System.out.println(box5.price+""+box5.w+""+box5.h);

        Box box6 = new BoxPrice(4.6,7.5,4.1,6.9,3.2);
        System.out.println(box6.l+" "+box6.h+" "+box6.w);

        BoxWeight box7 = new BoxPrice(2.2,3.4,2.5,3.4,4.5);
        System.out.println(box7.weight+" " +box7.l+" "+box7.h+" "+box7.w);

        BoxPrice box8 = new BoxPrice(3.5,4.6,4.5);
        System.out.println(box8.l+" "+box8.h+" "+box8.w+" "+box8.weight);
   */
       // BoxPrice box9 = new BoxPrice(box4);
       // System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight+" "+box4.price);




        //OVERRIDE CONCEPT FOR STATIC KEYWORD IN INHERITENCE


        //i)
        BoxWeight msg1 = new BoxWeight(); //BOXWEIGHT MESSAGE DELETED AND BOXWEIGHT IS INHERITED BOX SO WE NEED TO PRINT REFERENCE BOX CONTEXT
                                          //YOU CAN RUN MUCH YOU CANT HIDE
        BoxWeight.message();


        //ii)
        msg1.message();

        //iii)
         msg1.message();



          /* because the box does not care about boxweight and it takes its own value if there available
        Box interfaceEg = new BoxWeight();

        interfaceEg.a;

*/

    }
}
