/*
* CS 106A Assignment #2 Ex. 1
* Write a GraphicsProgram subclass
* Draw a blue rectangle, 350 x 270
* Make sure it's in the center of the screen
* 
*/

import acm.program.*;

import java.awt.Color;

import acm.graphics.*;

public class BlueRectangle extends GraphicsProgram {
	public void run() {
		GRect rect = new GRect(350,270);
		// new GLine(0, getHeight(), getWidth(), 0);
		rect.setColor(Color.BLUE);
		rect.setFillColor(Color.BLUE);
		rect.setFilled(true);
		double x = (getWidth() - rect.getWidth())/2;
		double y = (getHeight() - rect.getHeight()) / 2;
		add(rect, x, y);
		
	}
	
	
}

