import java.util.*;
class numberOperations {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean flag = true;
    int a = 0, b = 0;
    do { // do
      System.out.println("\t\t\t welcome to number operation");

      System.out.println("select the Operation\n1.PrimeNumber\n2.palindrome\n3.factorial\n4.perfectSquare\n5.Exit");
      int menu_choice = sc.nextInt();

      switch (menu_choice) { // switch
        case 1: { // case1
          System.out.println("Enter values of a");
          a = sc.nextInt();

          String res = findPrimeNumber(a);
          System.out.println("result is   ==>  " + res);
          break;
        } // case 1
        case 2: { // cvase2
          System.out.println("Enter values of a ");
          a = sc.nextInt();
           String res  = findpalindromeNumber(a);
          System.out.println("result is   ==>  " + res);
          break;
        } // cvase2
        case 3: { // case 3
          System.out.println("Enter values of a less than 10");
          a = sc.nextInt();
          String res = findFactorialNumber(a);
          System.out.println("result is   ==>  " + res);
          break;
        } // case 3
        case 4: { // case 4
          System.out.println("Enter values of a");
          a = sc.nextInt();
          String res = findPerfectsquare(a);
          System.out.println("result is   ==>  " + res);
          break;
        } // case 4
        case 5: { // case 5
          flag = false;
          System.out.println("closing calci");
          break;
        } // case 5

      } // switch

    } while (flag); // while
  }

  public static String findPrimeNumber(int n) { // findPrimeNumber
    String result = "";
    int i, m = 0, count = 0;
    m = n / 2;

    if (n == 0 || n == 1) {
      System.out.println("n is neither prime");
    }

    else {
      for (i = 2; i < m; i++) { // for
        if (n / i == 0) {
          count++;
          // result = n+"is  a prime";
          break;
        }
      } // for

      if (count == 1) {
        System.out.println(n + " is not prime");
        result = n + " is not prime";
      } else {
        System.out.println(n+"is a prime");
        result = n + "is a prime";
      }

    } // end of else

    return result;
  } // findPrimeNumber

  public static String findpalindromeNumber(int num) {
	   String result = "";

			   //palindrome logic
			int temp_bkup=num;
			int rem=0,sum=0;

			while(num>0){
			rem=num%10;//get remainder
			sum=(sum*10)+rem;
			num=num/10;
			System.out.println("num:"+num+"rem:"+rem+"sum :"+sum);
			}

					if(temp_bkup==sum){
						
						 result = temp_bkup + " is a palindrome";
						}
					else{
						
						result = temp_bkup + " is not palindrome";
						}


			//palindrome logic

  return result;
  }

  public static String findFactorialNumber(int num) {
     String result = "";

            //factorial logic

						//int fact=1;
						/**
						i written factorial program but if i enter more than 15 as input its working as negative y
			The issue you're encountering is likely due to integer overflow. In Java, the int data type has a maximum value of 2,147,483,647.
			The factorial of numbers greater than 15 exceeds this limit, causing the result to wrap around into negative values.

			**/
			long fact=1;



			  while(num>0){
				fact=fact*num;
				num--;

			  }

			result="FactorialNumber is "+fact;
   //factorial logic


    return result;
  }

  public static String findPerfectsquare(int num) {
    String result = "";

      //perfect square logic

			   // Step 1: Calculate the square root of num and store it in variable sqrt
				int sqrt = (int) Math.sqrt(num);

				// Step 2: Check whether the square of sqrt is equal to num
				if (sqrt * sqrt == num) {
					// Step 5: Print that num is a perfect square
					System.out.println(num + " is a perfect square.");
					result = num + " is a perfect square.";

				} else {
					// Print that num is not a perfect square
					System.out.println(num + " is not a perfect square.");
						result = num + " is  not a perfect square.";
				}




    return result;
  }
}
