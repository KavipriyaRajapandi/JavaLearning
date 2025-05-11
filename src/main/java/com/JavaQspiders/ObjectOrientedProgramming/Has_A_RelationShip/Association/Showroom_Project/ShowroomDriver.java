package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Association.Showroom_Project;

public class ShowroomDriver {
    public static void main(String[] args) {
        Engine e1 = new Engine("Diesel",600,"800hp");
        Engine e2 = new Engine("Petrol",700,"1000hp");
        Engine e3 = new Engine("Ev",500,"700hp");

        Vehicle[] vehicles = { new Vehicle("Bmw",90000.3,"Blue",e1),
                              new Vehicle("Verna",7000.1,"Black",e2),
                              new Vehicle("Tesla",90000.1,"White",e3)};

            ShowRoom showRoom = new ShowRoom("IsmailMotors","Vadapalani","Ismail",vehicles);

            showRoom.detailsOfShowroom();
            showRoom.detailsOfVehicles();
    }
}
