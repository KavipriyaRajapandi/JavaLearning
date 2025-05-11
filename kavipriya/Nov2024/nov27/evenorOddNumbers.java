import java.util.*;

class  evenorOddNumbers
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
System.out.println("Enter Number");
		int num=sc.nextInt();
		
//any number dvide by 2 and reminder is zero then even else ODD 
//

		String res=(num>0 && num%2==0)? "Even":(num==0 && num%2==0)? "neither even or odd":(num<0 && num%2==0)? "Even":"odd";

System.out.println("------->>> ans is"+res);

	}
}