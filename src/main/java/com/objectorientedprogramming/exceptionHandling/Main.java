package com.objectorientedprogramming.exceptionHandling;

public class Main {

    public static void main(String[] args) {


        //i)

        int a=5;
        int b=0;
        try {
         /* iii) */   //throw new Exception("i am useable for iii) until arithmetic exception shows up");
         /* ii) */ //diff(a,b);
         /* i)*/ //int c = a / b;

            /* iv)*/  String name = "Sibi";
            if(name.equals("Sibi")){
                throw new OwnException("hi");
            }


        }
        catch (OwnException e){
            System.out.println(e.getMessage());
        }


        catch(ArithmeticException e){
            System.out.println(e.getMessage());  //IMPLICIT WAY OF DOING EXCEPTION
        }
      /* iii)*/ catch (Exception e){
            System.out.println("i am default exception if there is no arithmetic exception im here for you");
        }
        finally{
            System.out.println("I Will always execute");
        }

    }

    static int diff(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("EXPLICIT WAY OF DOING EXCEPTION");
        }
        return a/b;
    }
}
