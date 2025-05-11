package com.JavaQspiders.Doubt_Project_OOPs.Charles_Ajith_Original_Project;

class Charles{
    int id;
    private String name;
    String location;

    Charles(){

    }

    Charles(int id,String name,String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }

    //getters
    public String getName(){
        return name;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    //unhappy method for child
    public void main(){
        System.out.println("Java");
    }

    //happy method for child
    public void common(){
        System.out.println("SQL");
    }
}
public class Ajith extends Charles{
    int id;
    private String name;
    String location;
    String age;

    Ajith(int id,String name,String location,String age){
        /*
        CASE 1 & CASE 2
         */
//        super(id,name,location);
        /*CASE 3 */
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
    }
    /*CASE 4*/
    public String getName(){
        return name;
    }
    //unhappy method Override
    @Override
    public void main(){
        System.out.println("Manual Testing");
    }
}
