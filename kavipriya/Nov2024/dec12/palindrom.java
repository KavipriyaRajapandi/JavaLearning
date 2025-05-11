//WAP to find the sum of n natural numbers
//n-10 ...natural starts from 1  using for and without for loop
// 1+2+...+10=100

//using for loop and using n(n+1)/2




//wajp for xylem number


//wajp  the given number is palindrome

// 484>> reverse >> a no after reverse remining same is called palindrome


//start>>num >>take a container rever =0,temp=num----->>(num>0)----->>>yes-----rev=(rev*10)+(num%10);>>num=num/10;----Do same process (repeat)
//(num>0)----->>>No------(temp==rev){palindrome} else {not palindrome}		


import java.util.*;
class palindrom{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your the number for Palindrome");
		int num_input=sc.nextInt();
		int rev=0;
		int temp=num_input;


       while(num_input>0)     {
		
							rev=(rev*10)+(num_input%10);
							num_input=num_input/10;
					}


					if(temp==rev){System.out.println(temp+"is a palindrome");}
					else{System.out.println(temp+"is not palindrome");}

		}
			

		}
	




