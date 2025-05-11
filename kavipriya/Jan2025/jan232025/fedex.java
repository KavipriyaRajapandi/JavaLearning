class fedex {
    // Static block
    static {
        System.out.println("Executing static block");
    }

    // Instance block
    {
        System.out.println("Executing instance block");
    }

    // Constructor

	public fedex(String x) {
       
		 System.out.println(" default value: " + bike_name);
		  System.out.println("Executing paramterized constructor");
        bike_name = "Java_java";
    }
    public fedex() {
        System.out.println("Executing default constructor");
		 System.out.println("a deafualt value: " + a);
        a = 10;
    }

    String bike_name;
    String b_colour;
    double b_price;
    int a;
    static String b_ownerName = "KAVI";

    // Non-static method
    public void ride() {
        System.out.println("Execute method call: non-static method ride");
    }

    public static void main(String[] args) {
        // Accessing fedex class members
        System.out.println("Main method execution starts");

        // Creating an object of fedex
        fedex b1 = new fedex();
		

        // Access non-static member using object 
        System.out.println("a value: " + b1.a);

         // Creating an object of fedex
		 fedex b2 = new fedex("java");
		System.out.println("bike name value: " + b2.bike_name);

        // Access static member using class name
        System.out.println("b_ownerName value: " + fedex.b_ownerName);

        // Print object address
        System.out.println("Object address: " + b1);

        // Access non-static member using object
        b1.ride();
    }
}
