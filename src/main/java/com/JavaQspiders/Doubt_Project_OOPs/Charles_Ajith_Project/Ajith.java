package com.JavaQspiders.Doubt_Project_OOPs.Charles_Ajith_Project;
class Charles{
    int id;
    private String name;
    String location;

    Charles(){}

    Charles(int id,String name,String location){
        this.id = id;
        this.name = name;
        this.location = location;
    }
    //getters
    public String getName(){
        return name;
    }

}

class Ajith extends Charles{
        int id;
        private String name;
        String location;
      String age;
      Ajith(int id,String name,String location,String age){
          super(id,name,location);
          this.age=age;
      }

//      @Override
//      public String getName(){
//          return name;
//      }
}
