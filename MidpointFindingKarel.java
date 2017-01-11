/*
 * File: MidpointFindingKarel.java

 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		dropFirstBeeper();
		if (frontIsClear()) {
			move();
			while (noBeepersPresent()) {
				farthestOpenCorner();
			}
			cleanUpBeepers();
			walkToMidpoint();
			move();
			cleanUpBeepers();
			walkToMidpoint();
		}
	}
	
//	If no beepers are present, leave 1 as a breadcrumb
//	Used to get to the centerpoint
	
	private void dropFirstBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
//	Walk to the furthest empty spot
//	Once you get there, drop a beeper
//	Turnaround, take a step, and drop another one
//	This is done to get to the midpoint of the grid
	
	private void farthestOpenCorner(){
		while (frontIsClear() && noBeepersPresent()) {
			move();
		}
		dropFirstBeeper();
		turnAround();
		move();
		dropFirstBeeper();
		move();
	}
	
//	Pick up a bunch of beepers in your path
//	Used after the midpoint has been identified
//	Since one requirement of this exercise is to not leave 
//	any other beepers behind
	
	private void cleanUpBeepers() {
		while (frontIsClear()) {	
			if (beepersPresent()) {
				pickBeeper();
			}
			move();
		}
		if (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
	}
	
//	Once all non-middle beepers are picked up,
//	get back to the midpoint, which is determined
//	by the next closest beeper
	
	private void walkToMidpoint() {
		while (noBeepersPresent()) {
			move();
		}
	}
	
	
}