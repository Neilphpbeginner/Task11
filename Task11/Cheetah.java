package Task11;								// Defining the package of all the classes is in witch will be used for this Task

public class Cheetah extends Animal {		// Defining class and inheritance super class
	
	private String name;					// Class Specific variable
	
//	Defining the constructor for this class that uses variables from the super class and class specific variable

	public Cheetah(int numTeeth, boolean spots, int weight) {
		super(numTeeth, spots, weight);
	}
	
//	Defining getter of the class specific variable

	public String getName() {
		return name;
	}
	
//	Defining setter of the class specific variable

	public void setName(String name) {
		this.name = name;
	}
	
//	Overiding the toString Method

	@Override
	public String toString() {
		return "Hi my name is "+this.name+" I am a Cheetah";
	}
	
	
	
	

}
