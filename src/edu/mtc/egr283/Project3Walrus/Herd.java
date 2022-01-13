package edu.mtc.egr283.Project3Walrus;

import java.util.ArrayList;
/*************************************************************
 * Class for handling the data in a <code>herd</code>.
 * This is the class to handle the ArrayList of Walrus-like records.
 * @author Christian Batista
 * @version 1.00 2019-02-20
 * Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class Herd {
	private ArrayList<Walrus> herd;
	
	/**************************************************************
	 * Constructor.
	 * Initialize the <code>ArrayList</code> variables.
	**/
	public Herd() {
		this.herd = new ArrayList<Walrus>();
	}// Ending bracket of default constructor
	
	/*************************************************************
	 * Mutator method to set the <code>Walrus</code> instance variables.
	 * @param what the value of the <code>newName</code> to be set.
	 * @param what the value of the <code>newAge</code> to be set.
	 * @param what the value of the <code>newWeight</code> to be set.
	 */
	public void addWalrus(String newName, int newAge, double newWeight) {
		this.herd.add(new Walrus(newName, newAge, newWeight));
	}// Ending bracket of method addWalrus
   
	/*************************************************************
	 * Mutator method to set the <code>Walrus</code> instance variables.
	 * @param what the value of the <code>newWalrus</code> to be set.
	 */
	public void addWalrus(Walrus newWalrus ) {
	   this.herd.add(newWalrus);
	}// Ending bracket of method addWalrus
   
	/*************************************************************
	 * Method to total the <code>getAge</code> values of the ArrayList
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public int averageAge() {
		int total = 0;
		
		for(int position = 0; position < this.getSize(); position++) {
     	   total += this.getWalrus(position).getAge();
		}// Ending bracket of for loop
	   return (total / this.getSize());
	}// Ending bracket of method averageAge
	
	/*************************************************************
	 * Method to total the <code>getWeight</code> values of the ArrayList
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public double averageWeight() {
		double total = 0;
		
		for(int position = 0; position < this.getSize(); position++) {
     	   total += this.getWalrus(position).getWeight();     	   
		}// Ending bracket of for loop
	   return (total / this.getSize());
	}// Ending bracket of method averageAge

	/*************************************************************
	 * Method to get <code>Walrus</code> value of the ArrayList
	 * @return Walrus.
	 */
	public Walrus getWalrus(int newGetWalrus) {
	   return this.herd.get(newGetWalrus);
	}// Ending bracket of method getWalrus
	
	/*************************************************************
	 * Method to get total herd <code>size</code> value of the ArrayList
	 * @return ArrayList size.
	 */
	public int getSize() {
		   return this.herd.size();
	}// Ending bracket of method size
   
	/*************************************************************
	 * Method to total the <code>getWeight</code> values of the ArrayList
	 * the largest value
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public Walrus largestWalrus() {		
		int largeWalrus = 0;
        for(int i = 1; i < this.getSize(); i++) {
            if (this.herd.get(largeWalrus).getWeight() < this.herd.get(i).getWeight())
            	largeWalrus = i;
        }// Ending bracket of method largestWalrus
        return this.herd.get(largeWalrus);
	}// Ending bracket of method findWalrus
	
	/*************************************************************
	 * Method to total the <code>getWeight</code> values of the ArrayList and return
	 * the smallest value
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public Walrus smallestWalrus() {
		int smallWalrus = 0;
        for(int i = 1; i < this.getSize(); i++) {
            if (this.herd.get(smallWalrus).getWeight() > this.herd.get(i).getWeight())
                smallWalrus = i;
        }// Ending bracket of method youngestWalrus
        return this.herd.get(smallWalrus);    
    }// Ending bracket of method findWalrus
   
	/*************************************************************
	 * Method to total the <code>getAge</code> values of the ArrayList
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public Walrus oldestWalrus() {
		int oldWalrus = 0;
        for(int i = 1; i < this.getSize(); i++) {
            if (this.herd.get(oldWalrus).getAge() < this.herd.get(i).getAge())
                oldWalrus = i;
        }// Ending bracket of method youngestWalrus
        return this.herd.get(oldWalrus); 
	}// Ending bracket of method findWalrus
    
	/*************************************************************
	 * Method to total the <code>getWeight</code> values of the ArrayList
	 * @return the local variable total and divides by the ArrayList size.
	 */
	public Walrus youngestWalrus() {
		int youngWalrus = 0;
		        for(int i = 1; i < this.getSize(); i++) {
		            if (this.herd.get(youngWalrus).getAge() > this.herd.get(i).getAge())
		                youngWalrus = i;
		        }// Ending bracket of method youngestWalrus
		        return this.herd.get(youngWalrus);
	}// Ending bracket of method findWalrus
   
	/**************************************************************
	 * Method to find a record in the flat file.
	 * This is a linear search.
	 * @param name to look up the record of 
	 * @return the found record, or null if not found.
	**/
	  public Walrus findRecord(String name) {
		  Walrus returnValue = null;

	    for(int i = 0; i < this.getSize(); ++i) {
	      if(this.herd.get(i).compareName(name)) {
	        returnValue = this.herd.get(i);
	      }// Ending bracket of if
	    }// Ending bracket of for loop

	    return returnValue;
	  } // public Record findRecord(String item)
	  
	/*********************************************************************
	 * Method to remove the element
	 * @param walrusName to look up the record of remove from ArrayList 
	**/	  
	public void removeWalrus(String walrusName) {
		for(int i =0; i < this.getSize();i++ ) {
			
			if(this.herd.get(i).compareName(walrusName)) {
				System.out.println(this.herd.get(i).getName()+" has been removed from the list");
				this.herd.remove(i);
			}// Ending bracket of method removeWalrus					
		}// Ending bracket of for loop
	}// Ending bracket of method findWalrus
   
	public String avgToString(){
		return String.format("Average Age: %d\nAverage Weight :%.2f\n",
				averageAge(),averageWeight());
	}// Ending bracket of method toString
	
	/*************************************************************
	 * Usual <code>toString</code> method to convert a record to a
	 *   <code>String</code>.
	 * @return the <code>toString</code> value of the record.
	**/
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for(Walrus e: herd) {
			sb.append(e.toString());	
		}// ending bracket of for loop
		return sb.toString();
	}// Ending bracket of method toString	
	
	/*************************************************************
	 * Usual <code>toString</code> method to convert the records of
	 * oldest, youngest, largest, and smallest walrus to a
	 * <code>String</code>.
	 * @return the <code>toString</code> value of the record.
	**/
	public String resultsToString() {
		StringBuffer sb = new StringBuffer();		
		sb.append("The Oldest Walrus is: \n" + this.oldestWalrus() +"\n");
		sb.append("The Youngest Walrus is: \n" + this.youngestWalrus() +"\n");
		sb.append("The largest Walrus is: \n" + this.largestWalrus() + "\n");
		sb.append("The Smallest Walrus is: \n" + this.smallestWalrus());
		return sb.toString();
	}// Ending bracket of method resultsToString
	
}// Ending bracket of class Herds