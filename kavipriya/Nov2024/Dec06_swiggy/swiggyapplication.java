import java.util.*;
class  swiggyapplication
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tWelcome To SWIGGY application");

System.out.println("Select the Hotel");
System.out.println("1.BUHARI\n2.BILAL3.AMMACANTEEN\n4.A2B");

int hotelOptionnum=sc.nextInt();

switch(hotelOptionnum){//line13
	case 1:{
		System.out.println("\t\t\t*****GREETINGS FROM BUHARI****");
	     System.out.println("select your Fav dish from menu\n1.Chicken65\n2.MuttonBriyani\n3.ChickenBriyani\n4.PrawnBriyani");
	int dishoptionNum=sc.nextInt();
				switch(dishoptionNum){//line 20
					case 1:{//c-65
										double chicken_dishprice=180.56;
								System.out.println("Enter the quantity");
								int quantity_Num=sc.nextInt();

								double system_bill=chicken_dishprice*quantity_Num;

										System.out.println("Total bill from System"+system_bill);

										System.out.println("Confirm the payment\n 1.Confirm\n2.Cancel the order");

										int confirmationUserOption=sc.nextInt();

												switch(confirmationUserOption){
													case 1:{
														System.out.println("Select the payment mode\n1.gpay");
														
														int paymentOption=sc.nextInt();

															switch(paymentOption){     //line 38
																case 1:{
																	int cardpin=3678;

																	System.out.println("Please enter the card pin of your");
																	int userPin=sc.nextInt();

																	if (cardpin==userPin)
																	{
																	System.out.println("Total bill from System"+system_bill);
																			
																	System.out.println("please re-enter the bill amount from ur end");//--sop

																	double userenterbill=sc.nextDouble();
																	if (system_bill==userenterbill)
																	{
																					
																				System.out.println("Processing the OTP");	
																					//generate otp
																					int system_otp=(int)(Math.random()*9999+9999);
																					System.out.println("system generated OTP"+system_otp);
																					System.out.println("please re-enter the OTP amount from ur end");
																					int userReenterOtp=sc.nextInt();
																					
																					
																					
																				if (system_otp==userReenterOtp){//order place
																				
																				System.out.println("amount is debited from your card /n ur food is placed and please wait for the delivery");
																				}
																				else
																				{//invalid otp
																			System.out.println("Invalid otp entered");
																				}

																	}

																	else{
																		System.out.println("Entered bill amount is wrong");
																	}



																	}

																	else {
																		System.out.println("Invalid mpin entered");

																	}

																	
																	break;}

																


																
															}//line 38

													
														break;}//confirm
													case 2:{break;}//cancel
												}
										

											
						
						break;}//--C65
					case 2:{break;}//mB
					case 3:{break;}//cB
					case 4:{break;}//PB
					
				}//line20
				
				break;
				
				}
    

	case 2:{break;}
	case 3:{break;}
	default:{break;}

}//line13




	}
}
