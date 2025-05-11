package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.WorkShop.School_Project;

import java.util.Scanner;

public class SchoolDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] s = { Student.getObject("Sibi",90,"A"),
                Student.getObject("Siva",80,"A"),
                Student.getObject("Sumi",99,"A"),
                Student.getObject("Andrew",20,"B")
        };

        School sch  = School.getSchool("ABCD","Surya","Vadapalani",s);
        boolean flag = true;
        do{
            System.out.println("Welcome to School System:");
            System.out.println("1.View Students Name\n2.Sort Students\n3.Remove Failed Students\n4.Details of Students\n5.Details of School\n6.Exit");
            int ip = sc.nextInt();
            switch (ip){
                case 1:{
                    sch.studentsName();
                    break;
                }
                case 2:{
                    sch.sortStudent();

                    break;
                }
                case 3:{
                    sch.removeFailedStudents();
                    break;
                }
                case 4:{
                    sch.detailsOfStudents();
                    break;
                }
                case 5:{
                    sch.detailsOfSchool();
                }
                case 6:{
                    flag = false;
                    break;
                }
            }
        }while(flag);
        System.out.println("Thank You");
    }
}
