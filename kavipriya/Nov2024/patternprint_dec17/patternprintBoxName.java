import java.util.*;
class patternprintBoxName 
{
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter Matrix Size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){// i loop
//print K
			for(int j=0;j<n;j++){//box1 
					if(j==0 || (i+j==n-1 && j>=n/2) || (i==j && j>=n/2))	
					System.out.print("* ");
					else
						System.out.print("  ");
			} //box1
			System.out.print("   ");


//print A
       for(int j=0;j<n;j++){//box2 

					if(i==0||j==0||j==n-1||i==n/2)	//||i==n/2||j==0 && i>=n/2||j==n-1 &&i>=n/2
					System.out.print("* ");
					else
						System.out.print("  ");
			} //box2
			System.out.print("   ");



// Print V 
			for (int j = 0; j < n; j++) { // box3
				if (j==0 && i<=n/2 ||j==n-1 && i<=n/2 || i==j+n/2 || i+j==n-1+n/2)
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box3 
				System.out.print("   ");




// Print I
			for (int j = 0; j < n; j++) { // box4
				if (i==0 ||i==n-1 ||j==n/2)
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box4
				System.out.print("   ");

//// Print P
			for (int j = 0; j < n; j++) { // box5
				if (i==0 ||i==n/2 ||j==0||j==n-1 && i<=n/2)
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box5
				System.out.print("   ");



//// Print R
			for (int j = 0; j < n; j++) { // box6
				if (i==0||i==n/2||j==0|| (j==n-1 && i<=n/2)||(i==j && i>=n/2))
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box6
				System.out.print("   ");

// Print I
			for (int j = 0; j < n; j++) { // box7
				if (i==0 ||i==n-1 ||j==n/2)
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box7
				System.out.print("   ");


// Print Y
			for (int j = 0; j < n; j++) { // box8
				if (i==j && j<=n/2||i+j==n-1 && j>=n/2||(j==n/2 && i>=n/2))
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box8 
				System.out.print("   ");


//print A
       for(int j=0;j<n;j++){//box2 

					if(i==0||j==0||j==n-1||i==n/2)	//||i==n/2||j==0 && i>=n/2||j==n-1 &&i>=n/2
					System.out.print("* ");
					else
						System.out.print("  ");
			} //box2
			System.out.print("   ");



// Print W 
			for (int j = 0; j < n; j++) { // box3
				//if ((j == i || j == n - 1 -i )
				if(j==0 || j==n-1||(i==j && j>=n/2)||(i+j==n-1 && j<=n/2))
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box3 
				System.out.print("   ");

/**

// Print V 
			for (int j = 0; j < n; j++) { // box3
			//	if ((j==0 && i<=n/2) || (j==n-1 && i<=n/2) || (i==n-2 && i==j) || (i==n-1 && j==n/2))
			if((j==n/2 && i<=n/2)|| (i==j && j>=n/2)||(j==n-1 && i<=n/2))
					System.out.print("* "); 
				else
					System.out.print("  ");
				} // box3 
				System.out.print("   ");

**/

            System.out.println("");

		}//i loop
	}
}