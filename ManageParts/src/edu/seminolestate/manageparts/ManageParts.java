package edu.seminolestate.manageparts;

public class ManageParts {
	
	//* A) Create an ArrayList in the main method in ManageParts.  Make the ArrayList template type be Part. This will
		//* enable you to store objects of any subtype of Part.
	
	//* B) Create a main method in the ManageParts  class. Display the menu below when the application starts. Redisplay
		//* the menu if an invalid value (not 1 through 5) is entered and continue the application.
		//* 1) Create Purchased Part
		//* 2) Create Manufactured Part
		//* 3) List a part
		//* 4) List all parts
		//* 5) Exit
	
	//* C) Use a Scanner object for all user input. Use System.out for all output.
	
	//* D) Create a PurchasedPart object if the user enters menu option 1. Get the data for the object from the user
		//* using a Scanner object. Prompt the user to enter each piece of data (id, description, sell price, purchase
		//* price, vendor, and handling cost). Use this data to create the object. Store the object in the ArrayList.
	
	//* E) Create a ManufacturedPart object if the user enters menu option 2. Get the data for the object from the user
		//* using a Scanner object. Prompt the user to enter each piece of data (id, description, sell price, labor cost,
		//* and material cost). Use this data to create the object. Store the object in the ArrayList.
	
	//* F) Part ID number must be unique in the ArrayList. Edit to make sure you are not creating a part object
		//* (PurchasedPart,  ManufacturedPart , or SubcontractedPart) with an ID that already exists. Display an error
		//* message and ask the user to reenter the ID if the original ID already exists for an object in the ArrayList.
	
	//* G) Display the data for one object in the ArrayList if the user enters menu option 3. Prompt the user to enter a
		//* part ID. Display an error message if an object with that ID does not exist in the ArrayList. Make sure you
		//* can handle the case where the ArrayList is empty by displaying an error message. Display the object using the
		//* toString method if a matching object is found. Also display the cost by calling the getTotalCost method. Do
		//* NOT include the getTotalCost as part of the toString method. You must call getTotalCost separately from
		//* toString. See sample output.
	
	//* H) Display all objects in the ArrayList if the user enters menu option 4. Format the output exactly as shown in
		//* the sample output. Display the object using the toString method. Also display the cost by calling the
		//* getTotalCost method. Do NOT include the getTotalCost as part of the toString method. You must call
		//* getTotalCost separately from toString. Format the part cost as currency whenever it is displayed. Make sure
		//* you can handle the case where the ArrayList is empty by displaying an error message.
	
	//* I) End the application if the user enters menu option 5. Display an ending message "Thanks for using the parts manager!".
	

	//*	J) Do NOT use the instanceof operator in this assignment. It is not needed.
	
	
}
