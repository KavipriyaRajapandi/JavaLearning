package com.objectorientedprogramming.ObjectCloning.ShallowCopy;

public class Human implements Cloneable {

    int age;
    String name;

    int arr[];

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,4,5,6};
    }

    public Object clone() throws CloneNotSupportedException{
        //return super.clone(); this till shallow copy
        Human twin = (Human)super.clone();

        //deep copy starts // create your own object

        twin.arr = new int[twin.arr.length];
        for(int i = 0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
