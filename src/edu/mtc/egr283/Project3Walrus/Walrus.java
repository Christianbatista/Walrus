package edu.mtc.egr283.Project3Walrus;

/*************************************************************
 * Class for handling the data in a <code>Walrus</code>.
 * This is the class to handle a single Walrus-like record.
 * @author Christian Batista
 * @version 1.00 2019-02-20
 * Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class Walrus {
	/*************************************************************
	 * Instance variables for the class.
	**/
		private String name = null;
		private int age = 0; //in years
		private double weight = 0;//in pounds
		
		/*************************************************************
		 * Constructor.
		 * We create the record and assign dummy values so as not to
		 * have null values.
		**/
		public Walrus()	{
			this("No name yet.", 0, 0);
		}// Ending bracket of default constructor
		
		/**************************************************************
		 * Constructor.
		 * Initialize the <code>Walrus</code> variables.
		 * @param initialName
		 * @param initialAge
		 * @param initialWeight
		**/
		public Walrus(String initialName, int initialAge, double initialWeight) {
			set(initialName, initialAge, initialWeight);
		}// Ending bracket of default constructor	
		
		/**************************************************************
		 * Constructor.
		 * Initialize the <code>Walrus</code> variables.
		 * @param initialName
		**/
		public Walrus(String initialName) {
			this(initialName, 0, 0);
			}// Ending bracket of constructor(name)
		
		/**************************************************************
		 * Constructor.
		 * Initialize the <code>Walrus</code> variables.
		 * @param initialAge
		**/			
		public Walrus(int initialAge) {
			this("No name yet.", initialAge, 0);
		}// Ending bracket of constructor(age)
		
		/**************************************************************
		 * Constructor.
		 * Initialize the <code>Walrus</code> variables.
		 * @param initialWeight
		**/
		public Walrus(double initialWeight) {
			this("No name yet.", 0, initialWeight);
		}// Ending bracket of constructor(weight)
		
		/*************************************************************
		 * Mutator method to set the <code>Walrus</code>.
		 * @param what the value of <code>newName</code> to be set.
		 * @param what the value of <code>newAge</code> to be set.
		 * @param what the value of <code>newWeight</code> to be set.
		**/
		public void setWalrus(String newName, int newAge,
					   double newWeight) {
			set(newName, newAge, newWeight);
		}// Ending bracket of setWalrus
	    
		/*************************************************************
		 * Private mutator method to set the <code>Walrus</code>.
		 * All other set methods call this private method
		 * @param what the value of <code>newName</code> to be set.
		 * @param what the value of <code>newAge</code> to be set.
		 * @param what the value of <code>newWeight</code> to be set.
		**/
	    private void set(String newName, int newAge,
				   double newWeight) {
	    	name = newName;
			if ((newAge < 0) || (newWeight < 0)) {
				System.out.println("Error: Negative age or weight.");
				System.exit(0);
			} else {
				age = newAge;
				weight = newWeight;
			} // Ending bracket of if
	    }// Ending bracket of method set
	       
		/*************************************************************
		 * mutator method to set the <code>Walrus</code>.
		 * age and weight are unchanged
		 * @param what the value of <code>newName</code> to be set.
		 */
		public void setName(String newName) {
			set(newName, age, weight);
		}// Ending bracket of method setName
		
		/*************************************************************
		 * mutator method to set the <code>Walrus</code>.
		 * name and weight are unchanged
		 * @param what the value of <code>newAge</code> to be set.
		 */
		public void setAge(int newAge) {
			set(name, newAge, weight);
		}// Ending bracket of method setAge
		
		/*************************************************************
		 * mutator method to set the <code>Walrus</code>.
		 * age and name are unchanged
		 * @param what the value of <code>newWeight</code> to be set.
		 */
		public void setWeight(double newWeight) {
			set(name, age, newWeight);
		}// Ending bracket of method setWeight
		
		/*************************************************************
		 * Accessor method to get the <code>name</code>.
		 * @return the value of <code>name</code>.
		**/
		public String getName() {
			return name;
		}// Ending bracket of method getName
		
		/*************************************************************
		 * Accessor method to get the <code>age</code>.
		 * @return the value of <code>age</code>.
		**/
		public int getAge() {
			return age;
		}// Ending bracket of method getAge
		
		/*************************************************************
		 * Accessor method to get the <code>weight</code>.
		 * @return the value of <code>weight</code>.
		**/
		public double getWeight() {
			return weight;
		}// Ending bracket of method getWeight
		
		/**************************************************************
		 * Method to compare the <code>name</code> values of records.
		 * This does a comparison on the data stored.
		 * @param that the "otherName" record to compare to
		 * @return if names are the same same will return true else stay false.
		**/
		public boolean compareName(String otherName) {
			boolean rv= false;
			if(otherName != null) {
				if(this.getName().equalsIgnoreCase(otherName)) {
					rv= true;
				} 
			}// Ending bracket of outer if
			return rv;
		}// Ending bracket of compareTo
				
		/**************************************************************
		 * Method to compare the <code>name</code> values of records.
		 * This does a lexicographic comparison on the data stored, so
		 * if the data stored is not in last-name order we will get
		 * something different from what might be expected.
		 * @param that the "that" record to compare to
		 * @return -1, 0, or +1 depending on how the comparison goes.
		**/
		public int compareTo(Walrus that) {
			if(this.getName().compareTo(that.getName()) < 0)
				return -1;
		    else if(this.getName().compareTo(that.getName()) > 0)
		      return +1;
		    else
		      return 0;
		}// Ending bracket of method compareTo
		
		/*************************************************************
		 * Usual <code>toString</code> method to convert a record to a
		 *   <code>String</code>.
		 * @return the <code>toString</code> value of the record.
		**/
		public String toString(){
			return String.format("Name : %s\nAge: %d\nWeight : %.2f\n",
					name,age,weight);
	    }// Ending bracket of method toString
			
}// Ending bracket of class Walrus