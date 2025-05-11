package com.objectorientedprogramming.properties.JavaDeterminesMethodsOnOverriding;

public class ObjectPrint {

    int num;

    ObjectPrint(int num){
        this.num=num;
    }

    @Override
    public String toString() {                   //IT DECIDING IT AT RUN TIME
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(12);

       // ObjectPrint obj2 = new ObjectPrint(23);


        System.out.println(obj);  //if we simply print obj we would get default toString method for println value so to avoid this we can override another toString method

    }
}
