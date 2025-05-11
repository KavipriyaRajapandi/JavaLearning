package com.objectorientedprogramming.properties.polymorphism;



public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();

        shape.area();

        Circle circle = new Circle();


        circle.area();

        Shapes triangle = new TriangleUsedOverrideConcept();

        triangle.area();

       // Square square = new Shapes();      it doesnt happen because shape doesnt give a fuck what happens or need in square functions


                                //OVER RIDING CONCEPT

        Shapes obj = new TriangleUsedOverrideConcept();  //shape is type reference which referencing the obj at the run time child class can print the object

        obj.area();

        //TriangleUsedOverrideConcept obj2 = new Shapes();

        //obj.area();

        Shapes obj2 = new Circle();

        obj2.area();

    }
}
