/*
 * File: StoneMasonKarel.java

 * --------------------------
 * CS106A Assignment 1, Problem 2
 * 
 * Karel has been hired to repair the damage done to the Quad
 *  in the 1989 earthquake. In particular, Karel is to repair a set of arches 
 *  where some of the stones (represented by beepers, of course) are missing 
 *  from the columns supporting the arches.
 *  
 *  This program is general enough to handle any world that meets certain basic 
 *  conditions as outlined here:
 *  
 *  Karel starts at 1st Avenue and 1st Street, facing east, with an infinite number
 * of beepers in Karel’s beeper bag.
 * The columns are exactly four units apart, on 1st, 5th, 9th Avenue, and so forth.
 * The end of the columns is marked by a wall immediately after the final column. 
 * This wall section appears after 13th Avenue in the example, but your program 
 * should work for any number of columns. The top of the column is marked by a 
 * wall, but Karel cannot assume that columns are always five units high, or even 
 * that all columns are the same height.
 * Some of the corners in the column may already contain beepers representing 
 * stones that are still in place. Your program should not put a second beeper 
 * on these corners.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	public void run() {
		while (frontIsClear()) {
			fixColumn();
			turnBack();
			skipColumn();
		}
	}
	
	
	/* This method lets Karel go up a column and fix any segments missing
	 * stones (aka beepers). It also addresses the fencepost issue of 
	 * putting a possible missing stone at the section right next to a wall.
	 */
	private void fixColumn() {
		while(frontIsClear()) {
			turnLeft();
			putStone();
		}
		if (noBeepersPresent()) {
			putBeeper();
		}

	}
	
	/*Shortcut for Karel to drop a stone in 
	 * every part of a column that may not have a stone
	 * present, and then advance 1 step.
	 */
	private void putStone() {
		while(frontIsClear()){
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}		
	}
	
	
	/* This command turns Karel around
	 * and has it head southward to the base
	 * of a column, and then point east, ready to advance
	 * to the next column base.
	 */
	private void turnBack() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	/* Move Karel forward to the next column.
	 * If this is the last column by a wall that has stones (every 4th column)
	 * then Karel will make sure this column is also fixed.
	 */
	private void skipColumn(){
		for (int i=0; i < 4; i++) {	
			
			move();
			
			
			if (frontIsBlocked() && i==3) {
				turnLeft();
				putStone();
			}

			
		}
	}
		

}
