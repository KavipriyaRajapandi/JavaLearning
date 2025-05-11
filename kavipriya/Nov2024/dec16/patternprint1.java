/**
class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		for(int i=0;i<11;i++){
		if(true)	
        System.out.print("* ");
		else
			System.out.print("  ");
		}
	}
} 

**/


/**
class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		for(int i=0;i<5;i++){
			for(int j=0;j <2;j++){

					if(true)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}
**/

/**

class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		for(int i=0;i<5;i++){
			for(int j=0;j <5;j++){

					if(true)	
					System.out.print(i+" ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}


**/


/**
class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=13;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){

					if(i==0||i==1||i==2||j==n-1 || i+j==n-1 || i==j || i==i/2 || j==j/2)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}

**/

/**

class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=13;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){

					if(i==0||i==n/2||i==n-1||j==0||j==1||j==2||i+j==n-1)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}
**/

//frst the identify the rows which need to print i=give drect_rownum , i=n-1(last row), i=i/2(middle row)
// then identify the columns which need to print j=give drect_colnum , j=n-1(last col), j=j/2(middle row)
//combine the conditionss using || OR
// diagonal left diagonal i==j ,right diagional i+j=n-12

/**

class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=7;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){

					if(i==0||i==n-1 ||j==0 ||j==n-1||i==n/2 || j==n/2|| i==j || i+j==n-1)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}

**/


/**
class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=7;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){

					if(i==0||i==n/2||i==n-1||j==0||j==1||j==2||i+j==n-1)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}

**/

class patternprint1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n=13;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){

					if(i==0||i==1||i==n/2||j==n/2||i+j=n-1)	
					System.out.print("* ");
					else
						System.out.print("  ");
			}

            System.out.println("");

		}
	}
}