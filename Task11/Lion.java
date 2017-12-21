package Task11;							// Defining the package of all the classes is in witch will be used for this Task

public class Lion extends Animal {		// Using the keyword extends to inherit the properties and methods from the Animal class

//	Declaring class specific variable out side the scope of inherited super class
	
	private int  age;	
	
//	Defining the constructor for this class that uses variables from the super class and class specific variable
	
	public Lion(int numTeeth, boolean spots, int weight, int age) {
		super(numTeeth, spots, weight); // Super class variables

//	Class specific variable getting allocated data types with the use of the constructor
		
		this.age 	=	age;	
	}
	
//	Defining getters for the class specific variables

	public int getAge() {
		return age;
	}
	
//	Defining class specific method's
	
	public String checkGender(int weight) {
		if(weight < 80) {
			return "This is only a cub";
		} else if (weight >=80 && weight <= 120) {
			return "This is a female";
		} else {
			return "This is a male";
		}
	}
	
//	Overiding the toString Method

	@Override
	public String toString() {
		return checkGender(this.getWeight()); // Calling the checkGender method to output to console
	}
}
