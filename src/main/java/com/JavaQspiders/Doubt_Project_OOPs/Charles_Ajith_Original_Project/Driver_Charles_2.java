package com.JavaQspiders.Doubt_Project_OOPs.Charles_Ajith_Original_Project;

public class Driver_Charles_2 {
    public static void main(String[] args) {
        /*
        CASE 1:
        if there is no overriden getter method in child then we would get output for all the ref,ref1,ref2
        CASE 2:
        But if there is overriden method we would get null because all our variable initialized in parent class contructor (super) not in child class
        (so when we use getName in child class our GLOBAL VARIABLE IS NOT INITIALIZED FOR CHILD CLASS IT IS INITIALIZED FOR PARENT CLASS
        (even if it inherited the parent class global variable with child class global variable out getter method
        checks for current class variables only not parent variable inherited)
        So,the getter method would return null
         */
        /*
        CASE 3
        if there is no overriden getter method
        So if we initialize(this.name=name) in child method contructor without using super(id,name,location) stmt we would traverse super() empty call
        now by (important) doing it upcasting object would initialize in child class itself since there is no super(id,name,location) and if we try to access
        ref1.getName() which is Charles Type (where we didnt initialize our global variable in parent class we did it in child class so we get null for that also)

        CASE 4:
        if there is overriden getter method
        we inititalized this.name in child class itself so we would get output for ref1,ref2
         */
        Charles ref = new Charles(3,"Charles","Vadapalani");
        Charles ref1 = new Ajith(2,"Ajith","Chennai","22");
        Ajith ref2 = new Ajith(4,"AjithKumar","Chennai","23");
        System.out.println(ref.getName());
        System.out.println(ref1.getName());
        System.out.println(ref2.getName());
    }
}
