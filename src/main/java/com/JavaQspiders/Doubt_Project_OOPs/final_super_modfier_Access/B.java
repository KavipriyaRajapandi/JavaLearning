package com.JavaQspiders.Doubt_Project_OOPs.final_super_modfier_Access;
class C {
    final int A = 3;
}
class A extends C{
    final int A = 5;

    public void m1(){
        System.out.println(A);
        System.out.println(super.A);
    }

}
public class B extends A {
    final int A = 10;

    @Override
    public void m1(){
        System.out.println(A);
        System.out.println(super.A);
    }

    public static void main(String[] args) {
//        B ref = new B();
//        ref.m1();
//        A ref2 = new A();
//        ref2.m1();
        A ref3 = new B();
        ref3.m1();
    }
}
