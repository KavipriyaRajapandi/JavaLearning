/**
class patternprint2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=5; 
		for(int i=0;i<5;i++){
			char input='A'; int num=1;
			for(int j=0;j<5;j++){

					if(i%2==0)	{
					System.out.print(input     +" ");
					input++;
					}
					else{
						System.out.print(num      +" ");
						num++;
						}
			}
            System.out.println("");

		}
	}
}

**/

class patternprint2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		 
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){

					if(i+j==n-1)	{
					System.out.print("* ");
					
					}
					else{
						System.out.print("  ");
						
						}
			}
            System.out.println("  ");

		}
	}
}