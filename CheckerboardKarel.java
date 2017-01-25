/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		
//		Add a checkerboard row	
		putBeeper();
		dropAlternate();
		pointNorth();

//		If able, move to the next row and face the rest of the board
		while (frontIsClear()) {

			if (beepersPresent() && frontIsClear()) {
				move();
				faceNewRow();
				
//				While possible, add beepers in this row
				if (frontIsClear()) {
					move();
					putBeeper();
					dropAlternate();
				} else if (frontIsBlocked()) {
					pointNorth();
						if (frontIsClear()) {
							move();
							putBeeper();
						}
				}
				
			} else if (noBeepersPresent() && frontIsClear()) {
				move();
				faceNewRow();
				if (frontIsClear()) {
					putBeeper();
					dropAlternate();					
				} 
			}
			
//			Get ready to move to the next row
			pointNorth();

		}
			
		
		
		
	}
	
//	This method drops beepers in alternate corners
	private void dropAlternate() {
		while (frontIsClear()) {
			move();
			if (frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}
	
//	This method helps point Karel northwards
	private void pointNorth() {
		turnLeft();
		while (notFacingNorth()) {
			turnLeft();
		}
	}
	
//	This method helps point Karel in the correct direction to start a new row
	private void faceNewRow() {
		if (leftIsBlocked()) {
			turnRight();
		} else turnLeft();
	}


}
