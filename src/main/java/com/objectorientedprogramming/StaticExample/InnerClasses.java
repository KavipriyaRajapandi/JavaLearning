package com.objectorientedprogramming.StaticExample;
//1.non static class considered its not a inner class but outerclass how it can access a static main method
/*


class Test{
     static String name;

    public Test(String name) {
        Test.name = name;
    }
}

 public class InnerClasses {                                       //OUTPUT WILL BE SIVA
                                                                                  //SIVA

     public static void main(String[] args) {
         Test a = new Test("sibi");
         Test b = new Test("siva");

         System.out.println(a.name);
         System.out.println(b.name);
     }
}*/

//2.static class example here innerclass is dependent on test class but test class doesnt dependent on obj of innerclass
// which test class and main method can have pass obj and functions each other

/*public class InnerClasses {

    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("sibi");
        Test b = new Test("siva");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}*/

//3.when you dont need test obj nad just printing obj for innerclass normally without using innerclass but we cant use 2 objs like innerclass to access the multiple values using static

public class InnerClasses {//one obj two names is pointless so dont recommand this...

    static String name = "sibi";
    static String name2 = "siva";
    static class Test{
        static String name;//we used static here thats why same value

        public Test(String name){
            Test.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClasses obj = new InnerClasses();
        Test a = new Test("sibi");
        Test b = new Test("siva");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(InnerClasses.name);
        System.out.println(InnerClasses.name2);

    }
}



