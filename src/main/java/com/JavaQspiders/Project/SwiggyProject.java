package com.JavaQspiders.Project;

import java.util.Scanner;

public class SwiggyProject {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Swiggy Applicaiton");
        System.out.println("ARE YOU HUNGRY??");
        System.out.println("Select the hotel:");
        System.out.println("------------------");
        System.out.println("1.Buhari\n2.Bilal\n3.Amma Canteen\n4.A2B");
        System.out.println("------------------");
        System.out.println("                                  ");
        System.out.println("Select the input to Select the Hotel\n");
        int hotel = sc.nextInt();

        System.out.println("/t/t/tProcessing.......");
        Thread.sleep(1000);
        switch(hotel){
            case 1:
                System.out.println("----------------");
                System.out.println("BUHARI!!!!!!!!!");
                System.out.println("----------------");
                System.out.println("Want to order in Buhari");
                System.out.println("Yes for 1 and 2 for next Hotel");
                int buhari = sc.nextInt();
                switch(buhari){
                    case 1:
                        System.out.println("Greetings from Buhari...");
                        System.out.println("Select Your favorite food");
                        System.out.println("--------------------------");
                        System.out.println("1.Chicken-65\n2.Mutton Biriyani\n3.Chicken Biriyani\n4.Prawn Biriyani");
                        System.out.println("---------------------------");
                        System.out.println("                          ");
                        System.out.println("Select the input for your food");
                        int food = sc.nextInt();

                        System.out.println("/t/t/tProcessing.......");
                        Thread.sleep(1000);

                        switch(food){
                            case 1:
                                System.out.println("Chicken-65");
                                int price = 180;
                                System.out.println("Select the quantity:");
                                int quantity = sc.nextInt();
                                int bill = price*quantity;
                                System.out.println("Total Bill is "+bill);

                                System.out.println("1.confirmation\n2.Cancellation");
                                System.out.println("                             ");

                                System.out.println("Are you ready to pay Sir?");

                                int confirmation = sc.nextInt();

                                switch (confirmation){
                                    case 1:
                                        System.out.println("Confirmed");
                                        System.out.println("Select the input");
                                        System.out.println("-----------------");
                                        System.out.println("1.G-pay\n2.Phone-pay");
                                        int pay = sc.nextInt();
                                        System.out.println("/t/t/tProcessing.......");
                                        Thread.sleep(1000);

                                        switch (pay){
                                            case 1:
                                                System.out.println("Google pay");
                                                int mpin = 3678;
                                                System.out.println("Enter the user mpin");
                                                int user_mpin = sc.nextInt();
                                                if(mpin == user_mpin){
                                                    System.out.println("Your bill amount is "+bill);
                                                    System.out.println("Enter user bill amount");
                                                    int bill_amount = sc.nextInt();
                                                    if(bill_amount == bill){
                                                        System.out.println("Get Otp:");
                                                        System.out.println("---------");
                                                        int system_otp = (int)(Math.random()*9999+9999);
                                                        System.out.println(system_otp);
                                                        System.out.print("Enter the user otp:");
                                                        int user_otp = sc.nextInt();
                                                        if(user_otp==system_otp){
                                                            System.out.println("---------------------------");
                                                            System.out.println("Ordered place your chicken-65");
                                                            System.out.println("---------------------------");

                                                        }

                                                    }
                                                }
                                                else{
                                                    System.out.println("Error pin");
                                                }

                                        }

                                        break;
                                    case 2:
                                        System.out.println("Not confirmed");
                                        break;
                                }
                                break;


                            case 2:
                                System.out.println("Mutton-Biriyani");
                                break;

                            case 3:
                                System.out.println("Mutton-Biriyani");
                                break;
                            case 4:
                                System.out.println("Mutton-Biriyani");
                                break;
                        }



                }


        }

    }
}
