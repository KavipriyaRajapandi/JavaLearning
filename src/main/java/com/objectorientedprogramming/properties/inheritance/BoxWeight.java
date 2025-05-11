package com.objectorientedprogramming.properties.inheritance;

public class BoxWeight extends Box{

    int a = 30;

    double weight;

     //@Override                                       //OVERRIDE DEPENDS ON OBJECT IN RUN TIME
    // static void message() {
        // System.out.println("Message BOOOO");              //  STATIC METHOD DONT DEPEND ON OBJECTS AND CHILD CLASS GET ACCESS TO PRINT THE MESSAGE FROM BOX CLASS
   //  }                                                                       //BUT PARENT CLASS DONT GIVE MESSAGES FOR CHILD CLASS
    //}//*/


    BoxWeight(){
        super();
        this.weight=-1;
    }


    //2.Multi level inheritance example

    BoxWeight(double side, double weight){
        super(side);
        this.weight= weight;
    }




    BoxWeight(double l, double w ,double h, double weight){
        super(l, w, h);
        this.weight=weight;
    }


    BoxWeight(BoxWeight other){
        super(other);
        this.weight= other.weight;
                                                  //it refers Box old constructor for other part (other = Box old)

    }

}
