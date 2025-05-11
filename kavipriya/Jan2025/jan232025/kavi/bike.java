class bike 
{

	String bike_name;
	String b_colour;
	double b_price;
	static String b_ownerName="KAVI";
	public void ride() 
	{
		System.out.println("Hello ride!");
	}

	public static void main(String[] args) 
	{//accessing bike class members
		bike b1=new bike();
    bike b2=new bike();
	bike b3=new bike();
	bike b4=new bike();
		System.out.println("obeject add"+b1);
		System.out.println("obeject add"+b2);
		System.out.println("obeject add"+b3);
		System.out.println("obeject add"+b4);

		System.out.println("obeject add"+b1.bike_name);
		System.out.println("obeject add"+b1.b_colour);
		System.out.println("obeject add"+b_ownerName);
	}


}
