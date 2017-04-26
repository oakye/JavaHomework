/*
* CS106A Assignment 2 - Exercise 4
* Draw an image of an archery target.
* Use 3 GOval objects, two red and one white, drawn in the correct order. 
* 
* The outer circle should have a radius of one inch (72 pixels), 
* the white circle has a radius of 0.65 inches, 
* and the inner red circle has a radius of 0.3 inches. 
* The figure should be centered in the window of a GraphicsProgram subclass.
*/

import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

public class ArcheryTarget extends GraphicsProgram {
	
	// Establish radiuses for the circles you'll be drawing
	private final static double INCH = 72;
	private final static double OUTER_CIRCLE = INCH;
	private final static double WHITE_CIRCLE = .65 * INCH;
	private final static double INNER_CIRCLE = .3 * INCH;
	
	public void run() {
		
		// draw the outer circle
		double xoc; 
		double yoc; 	

		GOval big_red = new GOval(OUTER_CIRCLE, OUTER_CIRCLE);
		
		xoc = ((getWidth() - big_red.getWidth())/2);
		yoc = ((getHeight() - big_red.getHeight())/2);	

		
		big_red.setFilled(true);
		big_red.setColor(Color.red);

		add(big_red, xoc, yoc);
		
		// draw the white circle
		double xm; 
		double ym; 	

		GOval middle_white = new GOval(WHITE_CIRCLE, WHITE_CIRCLE);
		
		xm = ((getWidth() - middle_white.getWidth())/2);
		ym = ((getHeight() - middle_white.getHeight())/2);	
		
		middle_white.setFilled(true);
		middle_white.setColor(Color.white);

		add(middle_white, xm, ym);
		
		// draw the inner circle
		double xic; 
		double yic; 	

		GOval small_red = new GOval(INNER_CIRCLE, INNER_CIRCLE);
		
		xic = ((getWidth() - small_red.getWidth())/2);
		yic = ((getHeight() - small_red.getHeight())/2);	
		
		small_red.setFilled(true);
		small_red.setColor(Color.red);

		add(small_red, xic, yic);
		
		
	}
	
}