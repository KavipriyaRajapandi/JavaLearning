//input a [4 5 6 7] b [ 8 10 8 6]

//output 4 8 5 10 6 8 7 6

import java.util.Arrays;
import java.util.Scanner;

class Arrays_Eg2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]=storedataInArray();
	
		System.out.println(" array  a =>>"+Arrays.toString(a));
		int b[]=storedataInArray();

		System.out.println(" array  b=>>"+Arrays.toString(b));

		int mergedArrayresult[]=MergeTwoArraysButInBetween(a,b) ;
     System.out.println("MergeTwoArrays =>>"+Arrays.toString(mergedArrayresult));

	}

	  public static int[] storedataInArray() 
	{
		System.out.println("Enter the array Size:");
		int size=sc.nextInt();

		int a[]=new int[size];
		
		
		for(int i=0;i<a.length;i++){//for\
				
			System.out.println("Enter the array elemnt for index:"+i);

		a[i]=sc.nextInt();
		}//for

	//System.out.println("finally array is =>>"+Arrays.toString(a));
		return a;
	}


	public static int[] MergeTwoArraysButInBetween(int[] x,int[] y) 
		{//MergeTwoArrays
		
     int mergedArray[]=new int[x.length+y.length];
    
	int m=0,n=0;
System.out.println("mergedArray lentght "+mergedArray.length);
	for(int i=0;i<mergedArray.length;i++){ 

				if(i % 2==0){
					mergedArray[i]=x[m];
					m++;	
					System.out.println("added "+i);
					}
					else{
				   mergedArray[i]=y[n];
					n++;
					System.out.println("added "+i);
					}
	
	}
		

		return mergedArray;

	  }//MergeTwoArrays

}
