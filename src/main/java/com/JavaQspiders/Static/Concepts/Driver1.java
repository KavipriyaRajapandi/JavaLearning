package com.JavaQspiders.Static.Concepts;

/*
Method Area
static members
psvm(){ - 10x
};

static{ - 11x
} x delete
one time executed no more mli will be called
static{ -12x
}   x delete

static void m1(){ -13x
}

void m1(){ -14x  ?
}

 */

public class Driver1 {
    //Table created
    static boolean a = true; //sli
    public static void main(String[] args) {
        System.out.println("Program Starts");
        System.out.println("a:"+a);
        System.out.println("Program Ends");
    }

    static {
        System.out.println("Hello");
        System.out.println("a:"+a);
        a=false;
    }
}
