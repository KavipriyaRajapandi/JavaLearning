package com.objectorientedprogramming.StaticExample;

public class StaticBlock {

    static int a = 6;
    static int b;

    static{
        System.out.println("Sibi is rocking");
        b = a + 3;
    }

    public static void main(String[] args) {

        //need objects for variable and initalized variable compulsory

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        //it wont load at second time because in static intitalization the obj cant twice be decalred it see wont print sibi is rocking its an condition/

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
