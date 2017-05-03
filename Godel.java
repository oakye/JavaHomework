/*
* Assignment 2 - Exercise 8
* Pick some positive integer and call it n.
* If n is even, divide it by two.
* If n is odd, multiply it by three and add one.
* Continue this process until n is equal to one.
* 
* Write a ConsoleProgram that reads in a number from the user and
*  then displays the Hailstone sequence for that number, 
*  followed by a line showing the number of steps taken to reach 1.
*  
*/

import acm.program.*;

public class Godel extends ConsoleProgram {
	
	public void run() {
		
		// get a positive number from the user
		int n = readInt("Enter a number: ");
		int counter = 0;
		
		while (n != 1) {
			
			// if n is even, divide by 2
			if (n % 2 == 0) {
				print(n + " is even so I take half: ");
				n = n / 2;
				println(n);
				counter++;
			}
			
			// if n is odd, multiply by 3 & add 1
			if ((n % 2 == 1) && (n != 1)) {
				print(n + " is odd, so I make 3n + 1: ");
				n = (3 * n) + 1;
				println(n);
				counter++;
			}
			
			// if n has become 1, then quit this loop
			if (n == 1) {
				break;
			}
						
		}
		println("The process took " + counter + " to reach 1.");
		
	}
	
}