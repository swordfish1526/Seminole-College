package edu.seminolestate.manageparts;

public class Part {
	private int partID;
	private String partDescription;
	private double partSellPrice;
	public static final String DEFAULT_DESCRIPTION = "no part description";
	public static final double DEFAULT_SELL_PRICE = 0;
	
	//* A) Create the constructor described in the UML class diagram that has 3 parameters. Implement the DRY principle by
		//* calling the set methods from the overloaded constructor. Use the edits in the set methods (described below) to
		//* ensure the parameter values are valid. Use the DEFAULT_DESCRIPTION and DEFAULT_SELL_PRICE constants if the 
		//*parameter values are invalid. 
		
		
	//* B) Create the constructor with one parameter for the part ID. This constructor must use 'this' to call the
		//* overloaded constructor (the one with three parameters described above). Use the default constants for the 
		//* description and sell price.
	
	//* C) Create a toString method that will return a String object containing the value of each data member. Use the
		//* @Override annotation. Display the class of the object using the getClass method.
	
	//* D) Create get and set methods for each of the 3 private data variables. The part ID must be greater than or
		//* equal to zero. The sell price must be greater than or equal to zero. The part description cannot be null
		//* and must have a length greater than zero. Do not update the private variables if the new values are not valid.

	//* E) Create a public method named getTotalCost that returns 0.
	
	//* F) Do not create additional data members or methods.
}
