//WAJP print the factors of a number

/**
input :10
output : 1 2 5
 
 input : 16

  1 2 4 8

  input : 18

  1 2 3 6 9 ....18>>> 2so ..9


  input : 1000
   1 2 ..1000 >>>> which leads to long time so make it as >>> start as 2 ..end as  input /2 >>


   input : 18

  1 2 3 6 9 ....18>>> 2so ..9

  input : 20
   1 2 ... 20 >> 2 ....10 


**/
import java.util.*;
class factorPrint{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your the number to find factor");
		int num_input=sc.nextInt();
	

		for (int i=2;i<=num_input/2;i++){
			
			if(num_input % i==0){
				
				System.out.print(" "+i);
				}
						
		}


		}

}