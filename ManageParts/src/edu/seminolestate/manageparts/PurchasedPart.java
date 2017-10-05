package edu.seminolestate.manageparts;

public class PurchasedPart {
	private double purchasePrice; //what does this part cost to buy?
	private String vendor;  //who do we buy this part from?
	private double handlingCost; //shipping and handling costs when we buy it
	public static final String DEFAULT_VENDOR_NAME = "no vendor name";
	public static final double DEFAULT_PURCHASE_PRICE = 0;
	public static final double DEFAULT_HANDLING_COST = 0; 
	
	//* A) Make this class a subclass of the Part class.
	
	//* B) Create the three constructors described in the UML class diagram. The first two constructors should use 'this'
		//* to call the third constructor (the constructor with six parameters). Use a combination of arguments and
		//* default values for the necessary arguments. The third constructor should use "super" to call the superclass 
		//* constructor passing the appropriate arguments.  Use the edits in the set methods (described below) to ensure
		//* the purchase price and the handling cost cannot be negative. Use the DEFAULT_PURCHASE_PRICE and DEFAULT_HANDLING_COST
		//* constants if the parameter values are invalid. Use the DEFAULT_VENDOR_NAME constant if a vendor name is not provided
		//* (it is null or has a length of zero). Use the public default constants from the Part class as needed. Implement
		//* the DRY principle by calling the set methods from the overloaded constructor (the one with three parameters).
	
	//* C) Create a toString method that will return a String object that contains the value of each data member. Use the
		//* @Override annotation. Display the class of the object using the getClass method. Call the toString method in
		//* the superclass to display the Part data.
	
	//* D) Create get and set methods for each of the 3 private data variables. The handling cost must be greater than or
		//* equal to zero. The purchase price must be greater than or equal to zero. The vendor cannot be null and must
		//* have a length greater than zero. Do not update the private variables if the new values are not valid.
	
	//* E) Create a public method named getTotalCost that returns the total cost from the super class plus the handling
		//* cost plus the purchase price. Use the @Override annotation to insure this method overrides the method of the
		//* same name in the parent class.
	
	//* F) Do not create additional data members or methods.
	
}
