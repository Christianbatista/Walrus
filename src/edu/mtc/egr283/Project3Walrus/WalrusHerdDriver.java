package edu.mtc.egr283.Project3Walrus;

import java.util.Scanner;

/**************************************************************
 * Main class to drive the <code>herd</code> application.
 * This program opens an input <code>Scanner</code> and an
 * creates an instance of a <code>herd</code> structure, and 
 * then writes out the <code>herd</code> to show that it is 
 * not empty.The program then reads the input into the structure,
 * writes out the structure as read, sorts the structure,
 * and writes out the sorted structure.
 * @author Christian Batista
 * @version 1.00 2019-02-20
 * Copyright (C) 2019 by Christian Batista.  All rights reserved.
**/
public class WalrusHerdDriver{

    public static void main(String[] args){
    	   Herd list = new Herd();

           System.out.println("Input the appropriate Walrus data");

           String loopCondition = "Y";

           while(loopCondition.equalsIgnoreCase("Y")){
        	   /************************************************************
                * variables and Scanner declaration 
                */
        	   Scanner console = new Scanner(System.in);
               String name = null;
               int age = 0;
               double weight = 0.0;
               
               /************************************************************
                * Input the data for name, age, weight and store it in the <code>ArrayList</code>.
                * @throws Exception if the input is invalid.
                */
               try{
                   System.out.print("Enter name of the the walrus : ");
                   name = console.next();

                   	System.out.print("Enter age of the walrus : ");
                   	age = console.nextInt();
                   	if(age < 0) {
                   		throw new Exception("Exception:negative age");
   					}// Ending bracket of if
                   	System.out.print("Enter weight of the walrus : ");
                   	weight = console.nextDouble();
                   	if(weight < 0) {
                   		throw new Exception("Exception:negative weight");
   					}// Ending bracket of if
                   	list.addWalrus(name, age, weight);

                   	System.out.print("Do you want to add data of another walrus ? (Y/N) : ");

                   	loopCondition = console.next();
                   	System.out.println();
               	} catch(Exception e){
               		System.out.println(e.getMessage());
               		System.out.println("Discarding the current wulrus details.");
               		System.out.println("Input positive number. Try Again");
       		  	}// Ending bracket of 
           }// Ending bracket of while loop
           
           Scanner console = new Scanner(System.in);
         //************************************************************
           // Prints out Walrus details and the averages of the walrus details.
           //
           System.out.println("The Wulrus Details are: ");
           System.out.println(list.toString());
           System.out.println(list.avgToString());
           System.out.println();
        
           System.out.println(list.resultsToString());
           
           //************************************************************
           // when condition is "Y", user will input name of walrus.
           // while loop will remove the data associated with the name from ArrayList
           //
           String removeCondition = "Y";
           while(removeCondition.equalsIgnoreCase("Y")) {
	           System.out.print("Are there any walrus's you want to remove? (Y/N): ");
	           removeCondition = console.next();
	           
	           if(removeCondition.equalsIgnoreCase("Y")) {
	           
		           System.out.print("Input Walrus name: ");
		           String inputName = console.next();
		           
		           list.removeWalrus(inputName);
	           }else
	        	   break;
           }// Ending bracket of while loop
         
           //************************************************************
           // Print out the final <code>ArrayList</code> data after any data is removed.
           //
           System.out.println("The Final Details are: ");
           System.out.println(list.toString());
         //*********************************************************
         // program is done. Close Scanner.
         console.close();  
       }// Ending bracket of method main
}// Ending bracket of class WalrusHerdDriver