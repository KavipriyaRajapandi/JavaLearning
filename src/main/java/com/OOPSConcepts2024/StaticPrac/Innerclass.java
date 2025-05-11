package com.OOPSConcepts2024.StaticPrac;

public class Innerclass {
    static class Test {
        String name;    //if we use static string name then it is comman output so for sibi siva it will come siva siva
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }


    public static void main(String[] args) {
        Test obj1 = new Test("sibi");
        Test obj2 = new Test("siva");

        System.out.println(obj1);

//        System.out.println(obj1.name);
//        System.out.println(obj2.name);
    }

}
