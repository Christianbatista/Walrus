package edu.mtc.egr283.Project3Walrus;

import java.util.Scanner;
/**
 * @author Christian Batista
 *
 */
public class WalrusDriver {
	
	public static void main(String[] args) {
		Walrus walrus1 = new Walrus("Chris");
		
		try {
			System.out.println("Enter the name, age, and weight of walrus 1: ");
			Scanner console = new Scanner(System.in);
				String name = console.nextLine();
				int age = console.nextInt();
				if(age < 0) {
					throw new Exception("Exception:negative age");
				}// Ending bracket of if
				int weight = console.nextInt();
				if(weight < 0) {
					throw new Exception("Exception: negative weight");
				}// Ending bracket of if
				walrus1.setName(name);
				walrus1.setAge(age);
				walrus1.setWeight(weight);
	
				System.out.println("My records say");
				System.out.println( walrus1.toString());
				
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Input positive number");

		} finally {
			System.out.println("End of program");
		}
	}
	
}// Ending bracket of class WalrusDriver