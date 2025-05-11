import java.util.*;

class swiggyapplicationwithHugelineofcodeProject1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome To SWIGGY application");

		System.out.println("Select the Hotel");
		System.out.println("1.BUHARI\n2.BILAL\n3.AMMACANTEEN\n4.A2B");

		int hotelOptionnum = sc.nextInt();

		switch (hotelOptionnum) { //switch of hotelOptionnum begins
			case 1:{//Buhari
					System.out.println("\t\t\t*****GREETINGS FROM BUHARI****");
					System.out.println("select your Fav dish from menu\n1.Chicken65\n2.MuttonBriyani\n3.ChickenBriyani\n4.PrawnBriyani");
					int dishoptionNum = sc.nextInt();

					switch (dishoptionNum) { //switch (dishoptionNum) BEGINS
						case 1:{ //c-65
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of ChickenBriyani");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default:{ //default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //--C65
						case 2:{//mB

							double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of MuttonBriyani");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //mB
						case 3:{//cB
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of ChickenBriyani");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //cB
						case 4:{//PB
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of PrawnBriyani");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //PB

					} //switch (dishoptionNum) ENDS
					break;

				}//Buhari

			case 2:{//BILAL
									System.out.println("\t\t\t*****GREETINGS FROM BILAL****");
					System.out.println("select your Fav dish from menu\n1.ROAST\n2.FRY\n3.KEBAB\n4.GRILL");
					int dishoptionNum = sc.nextInt();

					switch (dishoptionNum) { //switch (dishoptionNum) BEGINS
						case 1:{ //ROAST
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of ROAST");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default:{ //default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //--/ROAST
						case 2:{//FRY

							double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of //FRY");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
											System.out.println("I dnt want to proceed  payment");
												break;
										   } //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //FRY
						case 3:{//KEBAB
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of KEBAB");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //KEBAB
						case 4:{//GRILL
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of //GRILL");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							}//GRILL

					} //switch (dishoptionNum) ENDS
					break;
				}//BILAL

			case 3:{//AMMAN CANTEEN 
					System.out.println("\t\t\t*****GREETINGS FROM AMMAN CANTEEN ****");
					System.out.println("select your Fav dish from menu\n1.curd rice\n2.sambar\n3.dhosa\n4.pongal");
					int dishoptionNum = sc.nextInt();

					switch (dishoptionNum) { //switch (dishoptionNum) BEGINS
						case 1:{ //curd rice
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of curd rice");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default:{ //default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //--/curd rice
						case 2:{//sambar

							double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of sambar");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
											System.out.println("I dnt want to proceed  payment");
												break;
										   } //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //sambar
						case 3:{//dhosa
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of dhosa");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //dhosa
						case 4:{//pongal
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of pongal");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							}//pongal

					} //switch (dishoptionNum) ENDS
					break;
				}//AMMAN CANTEEN

		case 4:{//A2B
					System.out.println("\t\t\t*****GREETINGS FROM A2B ****");
					System.out.println("select your Fav dish from menu\n1.curd rice\n2.sambar\n3.dhosa\n4.pongal");
					int dishoptionNum = sc.nextInt();

					switch (dishoptionNum) { //switch (dishoptionNum) BEGINS
						case 1:{ //curd rice
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of curd rice");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default:{ //default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //--/curd rice
						case 2:{//sambar

							double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of sambar");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
											System.out.println("I dnt want to proceed  payment");
												break;
										   } //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //sambar
						case 3:{//dhosa
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of dhosa");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							} //dhosa
						case 4:{//pongal
								double dishprice = Math.round(Math.random() * 99 + 99);
								System.out.println("Enter the quantity of pongal");
								int quantity_Num = sc.nextInt();

								double system_bill = dishprice * quantity_Num;

								System.out.println("Total bill from System" + system_bill);

								System.out.println("Confirm the payment\n 1.Confirm the payment\n2.Cancel the payment");

								int confirmationUserOption = sc.nextInt();

								switch (confirmationUserOption) {
									case 1:{//payment >>yes
											System.out.println("Select the payment mode\n1.gpay\n2.PhonePay");

											int paymentOption = sc.nextInt();

											switch (paymentOption) { //switch(paymentOption) BEGINS
													case 1:{ //gpay
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your gpay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
																	}//gpay

													case 2: { //phonepay 
																int cardpin = 3678;
																System.out.println("Please enter the card pin of your Phonepay");
																int userPin = sc.nextInt();

																if (cardpin == userPin) {
																	System.out.println("Total bill from System" + system_bill);

																	System.out.println("please re-enter the bill amount from ur end"); //--sop
																	double userenterbill = sc.nextDouble();

																			if (system_bill == userenterbill) {

																				System.out.println("Processing the OTP");
																				//generate otp
																				int system_otp = (int)(Math.random() * 9999 + 9999);
																				System.out.println("system generated OTP" + system_otp);
																				System.out.println("please re-enter the OTP amount from ur end");
																				int userReenterOtp = sc.nextInt();

																				if (system_otp == userReenterOtp) { //order place
																					System.out.println("***amount is debited from your card*** \n =======>>>>>ur food is placed and please wait for the delivery");
																				} else { //invalid otp
																					System.out.println("Invalid otp entered");
																				}

																			} else {
																				System.out.println("Entered bill amount is wrong");
																			}

																		} else {
																			System.out.println("Invalid mpin entered");

																		}

																		break;
													}//phonepay 

													default :{//default payment option
														System.out.println("Invalid PAYMENT option selected");
														break;
																
													}//default payment option

											} //switch(paymentOption) END
											break;
										} //payment >>yes
									case 2:{//payment >>no
										System.out.println("I dnt want to proceed  payment");
											break;
										} //cancel
									default:{//payment option>>invalid
										System.out.println("INVALID PAYMENT CONFIRMATION is entered");
										break;
									}//payment option>>invalid

								}

								break;
							}//pongal

					} //switch (dishoptionNum) ENDS
					break;
				}//A2B

			default:{//default hotel

				System.out.println("Invalid Hotel selectionn.. pls try again");
					break;
				}//default hotel

		} //switch of hotelOptionnum END

	}
}