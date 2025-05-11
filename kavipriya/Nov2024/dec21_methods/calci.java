import java.util.*;
class calci 
{
	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		boolean flag=true;
		int a=0,b=0;
		do{//do
    System.out.println("\t\t\t welcome to Calci");

	System.out.println("select the Operation \n1.Addition\n2.Subtraction\n3.Multiply\n4.Div\n5.Exit");
		int menu_choice=sc.nextInt();

	switch(menu_choice) {//switch
	case 1: {//case1 
System.out.println("Enter values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();
 int res=add(a,b);
System.out.println("result is"+res);
		break;
		}//case 1
	case 2: {//cvase2 
		System.out.println("Enter values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();
 int res=sub(a,b);
System.out.println("result is"+res);
		break;}//cvase2 
	case 3: {//case 3 
		System.out.println("Enter values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();
 int res=mul(a,b);
System.out.println("result is"+res);
		break;}//case 3 
	case 4: {//case 4
		System.out.println("Enter values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();
 int res=div(a,b);
System.out.println("result is"+res);
		break;
		}//case 4
	case 5: { //case 5
		flag=false;
         System.out.println("closing calci");
		break;
		}//case 5
	
	}//switch
			
		}while(flag);//while
		
	}

public static int add(int a, int b) 
	{
		int res=a+b;
		return res;
	}

public static int sub(int a, int b) 
	{
		int res=a-b;
		return res;
	}


public static int mul(int a, int b) 
	{
		int res=a*b;
		return res;
	}

public static int div(int a, int b) 
	{
		int res=a/b;
		return res;
	}
}
