/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	public void run() {
		/* Move to the newspaper */
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();

		/* Get the newspaper */
		pickBeeper();
	
		/* Return to your original location */
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
	}
	
	
	private void turnRight() {
		/* An efficient way to get Karel to make a right turn */
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void turnAround() {
		/* An efficient way to get Karel to turn around and face the opposite direction */
		turnLeft();
		turnLeft();
	}
	
}
