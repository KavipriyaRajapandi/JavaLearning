import java.util.*;

class  evenorOdd
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
System.out.println("Enter Number");
		int num=sc.nextInt();
		
//any number dvide by 2 and reminder is zero then even else ODD 
//

		String res=(num%2==0)? "Even":"odd";

System.out.println(" ans is"+res);

	}
}
