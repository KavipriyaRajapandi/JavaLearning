import java.util.*;
class tablePrint{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter your the number to print table");
		int num_input=sc.nextInt();
	

		for (int i=1;i<=10;i++){
			
			System.out.println(" "+num_input+"x"+i+"="+num_input*i); 
						
		}


		}

}