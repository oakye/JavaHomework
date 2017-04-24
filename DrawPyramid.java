/*
* CS106A Assignment 2 - Exercise 3
* Write a GraphicsProgram subclass that draws a pyramid consisting of bricks in horizontal rows,
* so # of bricks in each row decreases by 1 as you move up the pyramid
* 
*/

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class DrawPyramid extends GraphicsProgram {
	
	// Define the following constants for these parameters
	private final static int BRICK_WIDTH = 30;
	private final static int BRICK_HEIGHT = 12;
	private final static int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		// Create your brick
		GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
		brick.setColor(Color.BLACK);
	
		// calculate the total width of your row
		int totalBrickWidth = BRICK_WIDTH * BRICKS_IN_BASE; 

		// confirm the starting height of the first brick row
		double y = (getHeight() - BRICK_HEIGHT);
		
		// confirm how many bricks are in this row
		int bib = BRICKS_IN_BASE;

		
		// Go to the next row with 1 less brick
		for (int r = BRICKS_IN_BASE; r > 0; r--) {
			
			// find out where the first brick should be laid
			double x = (getWidth() - totalBrickWidth)/2;		

			// Draw all the bricks in your row
			for (int b = 0; b < bib; b++) {
				
				add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
				
				// where to add the next brick in your row
				 x += BRICK_WIDTH;
			
			}
			
			// move up one row
			y -= BRICK_HEIGHT;
			
			// reduce the number of bricks in a row by 1 from the previous row
			bib -= 1;
			
			// reduce the total brick width of a row by 1 brick so the updated first brick is laid differently
			totalBrickWidth -= BRICK_WIDTH;
			
		}	
			
		
	}
}