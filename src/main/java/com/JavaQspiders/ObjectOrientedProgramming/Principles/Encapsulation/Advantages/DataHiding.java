package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.Advantages;

public class DataHiding {
    /*
    DataHiding is the Advantage of Encapsulation
    -Restricting Direct Access of Data Members (Private got no access outside the class)
    -Providing InDirect Access of Data Members (With Help of Helper Methods (To access Private Members))

    Helper Methods
    *getter()
    *setter()

    -Characteristics of Getter Method
    Access Modifiers must be public
    it should be non-static method (can be static for object creation and Singleton Class)
    it should have return type as data members
    it should be no-argument method
    Data-Members (Readable)

    -Characteristics of Setter Method
    Access Modifiers must be public
    it should be non-static method
    it should have return type as void
    it should be parameterized method
    Data-Members (Writable)

     */
    private String name; //r,w
    private double price; //r
    private int ram; //r,w

    public DataHiding(String name,double price,int ram){
        this.name = name;
        this.price = price;
        this.ram = ram;
    }
    //getters
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getRam(){
        return ram;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
}
