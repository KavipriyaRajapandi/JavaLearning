import java.util.*;
class stringexample2
{
	  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{

		while(true){
		System.out.println("Enter your String");
		String a1=sc.nextLine();

System.out.println("Enter your index");
		int index=sc.nextInt();
		           getCharcterofString(a1,index);
		}
	}


	public static char getCharcterofString(String input,int index){
		System.out.println("your output "+ input.charAt(index));
		return 'S';

	}
}