class forloop1
{
	public static void main(String[] args) 
	{
		System.out.println("Printing 1-100");
		for(int i=0;i<100;i++){
// System.out.println(" "+i); 

	 if (i%2==0)
	 {
					 System.out.println("===>>>"+i +"Even");
					 

	 }

	 
	 else if(i%2 !=0) {
		 System.out.println("===>>>"+i +"Odd");
					 
	 }

	 else if (i%3==0 && i%9==0)
	 {
		 		 System.out.println("===>>>"+i +" no is divisble by 3 and 9");

	 }


		}


	}
}
