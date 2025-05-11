import java.util.Arrays;
import java.util.Scanner;



 // Java program for implementation of Insertion Sort
class InsertionSort {
  static Scanner sc=new Scanner(System.in);
    // Function to sort array using insertion sort
  public static  void sort(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
          
            a[j + 1] = k;
        }
		System.out.println("array  a =>>"+Arrays.toString(a));
    }

    public static void main(String args[])
    {
       // int a[] = { 12, 11, 13, 5, 6 };

        int a[]=storedataInArray();

      sort(a);

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

}