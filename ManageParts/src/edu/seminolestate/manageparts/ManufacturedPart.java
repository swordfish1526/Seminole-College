package edu.seminolestate.manageparts;

public class ManufacturedPart {
	
	private double laborCost;//cost to make part 
	private double materialCost;//amount of material in product
	public static final double DEFAULT_LABOR_COST = 0;
	public static final double DEFAULT_MATERIAL_COST = 0;
	
	//* A) Make this class a subclass of the Part class.
	
	//* B) Create the three constructors described in the UML class diagram. The first two constructors should use 'this'
		//* to call the third constructor (the constructor with five parameters). Use a combination of arguments and
		//* default values for the necessary arguments. The third constructor should use "super" to call the superclass 
		//* constructor passing the appropriate arguments.  Use the edits in the set methods (described below) to ensure
		//* the labor cost and material cost cannot be negative. Use the default values if the data is invalid 
		//* (DEFAULT_LABOR_COST and DEFAULT_MATERIAL_COST. Use the public default constants from the Part class as needed.

	//* C) Create a toString method that returns a String object containing the value of each data member. Use the
		//* @Override annotation.Display the class of the object using the getClass method. Call the toString method in
		//* the superclass to display the Part data.
	
	//* D) Create get and set methods for both of the 2 private data variables. The labor cost and the material cost must
		//*	be greater than or equal to zero. Do not update the private variables if the new values are not valid.
	
	//* E) Create a public method named getTotalCost that returns the total cost from the super class plus the material
		//* cost plus the labor cost. Use the @Override annotation to insure this method overrides the method of the
		//* same name in the parent class.
	
	//* F) Do not create additional data members or methods.
}
