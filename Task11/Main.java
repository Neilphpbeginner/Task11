package Task11;				// Defining the package of all the classes is in witch will be used for this Task


public class Main {		   // Defining the class
	
//	Declaring the main method

	public static void main(String[] args) {
		
		Lion myLion 	= 	new Lion(20, true, 60, 5);  		// Declaring the first instance of the class lion
		Lion myLion2	=	new Lion(18, false, 82, 4); 		// Declaring the second instance of the class lion
		Lion myLion3	=	new	Lion(5, true, 150, 8);  		// Declaring the third instance of the class lion
		Cheetah myCheetah 	=	new Cheetah(12, true, 25);		// Calling cheetah setName method
		myCheetah.setName("Neil");
		
//		Printing out the toString Method
		
		System.out.println(myLion.toString());
		System.out.println(myLion2.toString());
		System.out.println(myLion3.toString());
		System.out.println(myCheetah.toString());
	}

}
