


/**

*
* *
* * *
* * * *
* * * * *


class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i>=j)
						System.out.print("* ");
					else
						System.out.print(" ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}

**/



/**
Hello World!
* * * * *
  * * * *
    * * *
      * *
        *
class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i<=j)
						System.out.print("* ");
					else
						System.out.print("  ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}


**/



/**

Hello World!
* * * * *
* * * *
* * *
* *
*

class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i+j<=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}


**/






/**
Hello World!
        *
      * *
    * * *
  * * * *
* * * * *



class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i+j>=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}



**/




/***


Hello World!


    *
  * * *
* * * * *


class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i+j>=n-1 && i>=j)
						System.out.print("* ");
					else
						System.out.print("  ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}

**/

/**
* * * * *
* * * *
* * *
* * * *
* * * * *

if(i+j<=n-1 || i>=j)

**/


/***


* * * * *
  * * *              
    *

if(i+j<=n-1 && i<=j) AND 



* * * * *
* * * * *
* * * * *
* *   * *
*       *

if(i+j<=n-1 && i<=j) OR 

	**/

class Test1 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Hello World!");

		for(int i=0;i<n;i++){//fotr i
			
				for(int j=0;j<n;j++){//for j
					
					if(i>=j && (i+j>=n-1))
						System.out.print("* ");
					else
						System.out.print("  ");


				}//for j

     System.out.println(" ");
		}//for i
	}
}



