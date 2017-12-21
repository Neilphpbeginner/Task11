package Task11;			// Defining the package of all the classes is in witch will be used for this Task

public class Animal {  // Defining the class Animal
	
//	Declaring class specific variables using the private access modifier
	
	private int 		numTeeth;
	private boolean 	spots;
	private int			weight;
	
//	Defining constructor for the class
	
	public Animal(int numTeeth, boolean spots, int weight) {
		super();
		this.numTeeth = numTeeth;
		this.spots = spots;
		this.weight = weight;
	}
	
//	Defining getters of the fields in the class

	public int getNumTeeth() {
		return numTeeth;
	}

	public boolean isSpots() {
		return spots;
	}

	public int getWeight() {
		return weight;
	}
}
