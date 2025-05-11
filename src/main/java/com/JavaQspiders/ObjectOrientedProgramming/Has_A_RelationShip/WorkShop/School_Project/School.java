package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.WorkShop.School_Project;

public class School {
    private String scName;
    private String principal;
    private String location;

    Student[] s;

    private School(String scName,String principal,String location,Student[] s){
        this.scName = scName;
        this.principal = principal;
        this.location = location;
        this.s = s;
    }

    //getters
    public String getScName(){
        return scName;
    }

    public String getPrincipal(){
        return principal;
    }

    public String getLocation(){
        return location;
    }

    public static School getSchool(String scName,String principal,String location,Student[] s){
        return new School(scName,principal,location,s);
    }

    public void studentsName(){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());
        }
    }
    public void sortStudent(){
        /*
        Instead of swapping only marks, swap entire Student objects. This ensures that all student details stay intact.
Bubble sort logic is corrected by adding - i to optimize it.
         */
        for(int i=0;i<s.length-1;i++){
            for(int j=0;j<s.length-1;j++){
                if(s[j].getMarks()>s[j+1].getMarks()){
                    Student temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        detailsOfStudents();
    }

    public void detailsOfStudents(){
        for(int i=0;i<s.length;i++) {
            System.out.println("Student name:"+s[i].getName());
            System.out.println("Student marks:"+s[i].getMarks());
            System.out.println("Student section:"+s[i].getSection());
            System.out.println("                             ");
        }
    }

    public void removeFailedStudents() {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getMarks() >= 35) {
                count++;
            }
        }
        //updating student array
        Student[] passed = new Student[count];
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getMarks() >= 35) {
                passed[index++] = s[i];
            }
        }
        //new updated student array
        s = passed;

        System.out.println("Updated Passed Students:");
        detailsOfStudents();
    }

    public void detailsOfSchool(){
        System.out.println("School Name:"+scName);
        System.out.println("School Principal:"+principal);
        System.out.println("School Location:"+location);
        System.out.println("                     ");
    }

}
