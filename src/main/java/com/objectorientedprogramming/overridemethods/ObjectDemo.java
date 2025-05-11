package com.objectorientedprogramming.overridemethods;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.gpa == ((ObjectDemo)obj).gpa;

    }


    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(24,34.4f);
        ObjectDemo obj2 = new ObjectDemo(24,38.4f);

        if(obj1.equals(obj2)){

            System.out.println("obj1 is equal to obj2");

        }
        else{
            System.out.println("not equal");
        }
    }

}
