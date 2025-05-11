import java.util.Arrays;
import java.util.Scanner;

class storeElemtInArray_Eg1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]=storedataInArray();
		System.out.println(" array  a =>>"+Arrays.toString(a));
		int b[]=storedataInArray();
		System.out.println(" array  b=>>"+Arrays.toString(a));

		int revArray[]=Reverse_ArrayCall(b);
	   System.out.println("reverse array is =>>"+Arrays.toString(revArray));
		int mergedArrayresult[]=MergeTwoArrays(a,revArray) ;
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



 public static int[] Reverse_ArrayCall(int[] a) 
	{//ReverseArray
		
      int reversearray[]=new int[a.length];

	  for(int i=0,j=a.length-1;i<reversearray.length;i++,j--){
		
      reversearray[i]=a[j];

	  }

   // System.out.println("finally reverse array is =>>"+Arrays.toString(reversearray));
		return reversearray;

	}//ReverseArray



	public static int[] MergeTwoArrays(int[] x,int[] y) 
		{//MergeTwoArrays
		
     int mergedArray[]=new int[x.length+y.length];
      int m=0;// x array
	  int n=0;// y array

		for(int i=0;i<mergedArray.length;i++){   // for>> merge two arrays in one using pointers
			
			if(i<x.length){
				
					 mergedArray[i]=x[m];
					 m++;
			}

			else{
				 mergedArray[i]=y[n];
				 n++;

			}
		}// for>> merge two arrays in one

		

		return mergedArray;

	  }//MergeTwoArrays





}



