import java.util.*;

class scannerExamples 
{

static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("********1------GETTING EMPLOYEE DETAILS***********");

   System.out.print("Enter the DEATILS ---->> emp_id :"+"\t"+"emp_name"+"\t"+"emp_sal :"+"\t"+"emp_contact"+"\n");
	int emp_id=sc.nextInt();
	String emp_name=sc.next();
	double emp_sal=sc.nextDouble();
	long emp_contact=sc.nextLong();
	System.out.println("********PROCESSING***********");
	Thread.sleep(3000);
	System.out.print("PRINTING the EMPLOYEE DETAILS"+"\n"+"---->>\t emp_id :"+emp_id+"\t"+"emp_name :"+emp_name+"\t"+"emp_sal :"+emp_sal+"\t"+"emp_contact :"+emp_contact+"\n");
	
  System.out.println("\n\n\n\n\n");
		

    System.out.println("2------GETTING FAV BIKE DETAILS---------");

   System.out.print("Enter the FAV BIKE DEATILS ---->> bike_name :"+"\t"+"bike_Price :"+"\t"+"bike_colour :"+"\n");

	String bike_name=sc.next();
	double bike_Price=sc.nextDouble();
	String bike_colour=sc.next();
	System.out.println("********PROCESSING***********");
	Thread.sleep(3000);
	System.out.print("PRINTING the BIKE DETAILS"+"\n"+"---->> \t bike_name :"+bike_name+"\t"+"bike_Price :"+bike_Price+"\t"+"bike_colour :"+bike_colour+"\n");


  System.out.println("\n\n\n\n\n");

	    System.out.println("3------GETTING BEST FRIEND DETAILS---------");

   System.out.print("Enter the BEST FRIEND DETAILS ---->> friend_name :"+"\t"+"friend_age :"+"\t"+"friend_contact :"+"\n");

	String friend_name=sc.next();
	int friend_age=sc.nextInt();
	long friend_contact=sc.nextLong();
	System.out.println("********PROCESSING and Printing ***********");
	Thread.sleep(3000);
	 System.out.print("Printing the BEST FRIEND DETAILS \n ---->>\t friend_name :"+friend_name+"\t"+"friend_age :"+friend_age+"\t"+"friend_contact :"+friend_contact+"\n");

    System.out.println("\n\n\n\n\n");




	  	    System.out.println("3------GETTING girlfriend name---------");

   System.out.print("Enter the GIRL FRIEND DETAILS \n ---->> girlfriend_name :"+"\t"+"girlfriend_age :"+"\t"+"girlfriend_weight :"+"\tgirlfriend_contact"+"\tFather_contact\n");

	String girlfriend_name=sc.next();
	int girlfriend_age=sc.nextInt();
	int girlfriend_weight=sc.nextInt();
	long girlfriend_contact=sc.nextLong();
	long Father_contact=sc.nextLong();
	  System.out.print("PRINTING the GIRL FRIEND DETAILS"+"\n"+"---->> girlfriend_name :"+girlfriend_name+"\tgirlfriend_age :"+girlfriend_age+"\tgirlfriend_weight :"+girlfriend_weight+"\tgirlfriend_contact :"+girlfriend_contact+"\tFather_contact :"+Father_contact);

    


	}

}
