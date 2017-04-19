/*
 * CS106A - Assignment 2 - Exercise 2
 * Write a ConsoleProgram subclass that prints out the calls
 * for a spaceship. Countdown from 10 to 1 then write "liftoff".
 * You must use a loop.
 */

import acm.program.*;

public class SpaceshipCountdown extends ConsoleProgram {
	
	private static final int START = 10;
	
	public void run() {
		for(int i=START; i>0; i--) {
			println(i);
		}
		println("Liftoff");
	}
	
}