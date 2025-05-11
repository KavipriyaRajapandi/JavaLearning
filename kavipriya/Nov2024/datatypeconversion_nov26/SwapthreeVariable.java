class SwapthreeVariableWITHtemppVariable
{
	public static void main(String[] args) 
	{
int a=10,b=20,c=30,temp;

//op : a=30,b=10,c=20



temp=a;//temp>>10
a=c;//a >>30
c=temp;//c>>10,temp=10

//comapre b and c
temp=b;
b=c;
c=temp;
System.out.println("a"+a+"b"+b+"C:"+c+"Temp"+temp);


	}
}
