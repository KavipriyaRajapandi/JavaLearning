package com.JavaQspiders.Static.Concepts;

/*
Method Area (Shaam)

static{
}

psvm(s[]args){
}

static void m1(){
}


Method Area (Ram)
static{
}
psvm{
}

 */

public class Shaam {
    //Table created
    static{
        System.out.println("Hi this is shaam");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Ram.a);
        //if u print ram only then u can continue
        System.out.println("venus");
        System.out.println(Ram.a);
        System.out.println("jupiter");

    }

    static String name = "jAVA";

    public static void m1(){
        System.out.println("Hi");
    }
}

class Ram{
    //table created
    static boolean a = true;

    static { // when coming to ram class first priority for mli
        System.out.println("Hi this is Ram class");
    }

    public static void main(String[] args) {
        System.out.println("Hello earth");
        //System.out.println(Shaam.name);
    }
}

