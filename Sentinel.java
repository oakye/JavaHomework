/*
* Assignment 2 - Exercise 7
* Write a ConsoleProgram that reads in a list of integers, one per line, until a sentinel
* value of 0 (which you should be able to change easily to some other value). 
* When the sentinel is read, your program should display the smallest and largest values
* in the list
* 
* Your program should handle the following special cases:
* (1) If the user enters only one value before the sentinel, the program should report
* that value as both the largest and smallest.
* (2) If the user enters the sentinel on the very first input line, then no values 
* have been entered, and your program should display a message to that effect.
*/

import acm.program.*;

public class Sentinel extends ConsoleProgram {
	
	private final static int SENTINEL = 0; 
	
	public void run() {
		int number = 1;
		int smallest = 0;
		int largest= 0;
		int counter = 0;
		
		println("This program finds the largest & smallest numbers.");
		
		// repeat this until the sentinel number is entered
		while (number != SENTINEL) {
			
			// read in an integer
	
			number = readInt("? ");
			
			// if the first entry is the sentinel, the display no values
			if (number == SENTINEL && counter == 0) {
				println("No values have been entered.");
				break;
			}
			
			// if the first entry is not the sentinel, then it's both the 
			// smallest & largest values
			if (number != SENTINEL && counter == 0) {
				smallest = number;
				largest = number;
			}
			
			// if the 2nd entry is the sentinel, then largest = smallest values
			if (number == SENTINEL && counter == 1) {
				break;
			}
			
			// is it the smallest value? if yes, make it the new smallest number
			if (number < smallest) {
				smallest = number;
			}
			
			// is the the largest value? if yes, make it the new largest number
			if (number > largest) {
				largest = number;
			}
			
			counter++;
			
		}
		// after leaving the while loop because someone entered the sentinel
		if (counter > 0) {
			println("smallest: " + smallest);
			println("largest: " + largest);
		} else return;
		

		
	}
	
}