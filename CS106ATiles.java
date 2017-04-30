/*
* CS106A Assignment 2 - Exercise 6
* display four tiles (rectangles), each containing the text “CS106A” in the 
* center of the graphics window.
* 
*  Width and height of each of the four tiles (rectangles) should be specified as
*  named constants TILE_WIDTH and TILE_HEIGHT
*  
*  Text/label “CS106A” should be centered in each of the respective four tiles
*  
*  Entire figure (of four tiles) should be centered in the graphics window
*/

import acm.graphics.*;
import acm.program.*;

public class CS106ATiles extends GraphicsProgram {
	
	// establish dimensions for each tile
	private final static int TILE_WIDTH = 80;
	private final static int TILE_HEIGHT = 40;
	
	// establish the space between tiles
	private final static int TILE_SPACE = 10;
	
	public void run() {
		
		// draw rectangle in right top
		double xrt = getWidth()/2 + TILE_SPACE;
		double yrt = getHeight()/2 - TILE_SPACE- TILE_HEIGHT;
		
		GRect rightTop = new GRect(TILE_WIDTH, TILE_HEIGHT);
		add(rightTop, xrt, yrt);
		
		// add text in the middle of the right top box
		GLabel labelRt = new GLabel("CS106A");

		double xrt_text = (rightTop.getWidth() - labelRt.getWidth())/2;
		double yrt_text = (rightTop.getHeight() + labelRt.getAscent())/2;
		
		add(labelRt, (xrt+xrt_text), (yrt+yrt_text));
		
		// draw rectangle in right bottom
		double xrb = xrt;
		double yrb = getHeight()/2 + TILE_SPACE;
		
		GRect rightBottom = new GRect(TILE_WIDTH, TILE_HEIGHT);
		add(rightBottom, xrb, yrb);
		
		// add text in the middle of the right bottom box
		GLabel labelRb = new GLabel("CS106A");
		double xrb_text = xrt_text;
		double yrb_text = (rightBottom.getHeight() + labelRb.getAscent())/2;
		add(labelRb, (xrb+xrb_text), (yrb+yrb_text));
		
		// draw rectangle in left top
		double xlt = getWidth()/2 - TILE_SPACE - TILE_WIDTH;
		double ylt = yrt;
		GRect leftTop = new GRect(TILE_WIDTH, TILE_HEIGHT);
		add(leftTop, xlt, ylt);
		
		// add text in the middle of the left top box
		GLabel labelLt = new GLabel("CS106A");
		double xlt_text = (leftTop.getWidth() - labelLt.getWidth())/2;
		double ylt_text = (leftTop.getHeight() + labelLt.getAscent())/2;
		add(labelLt, (xlt+xlt_text),(ylt+ylt_text));
		
		// draw rectangle in the left bottom
		double xlb = xlt;
		double ylb = yrb;
		GRect leftBottom = new GRect(TILE_WIDTH, TILE_HEIGHT);
		add(leftBottom, xlb, ylb);
		
		// add text in the middle of the left bottom box
		GLabel labelLb = new GLabel("CS106A");
		double xlb_text = (leftBottom.getWidth() - labelRb.getWidth())/2;
		double ylb_text = (leftBottom.getHeight() + labelRb.getAscent())/2;
		add(labelLb, (xlb+xlb_text), (ylb+ylb_text));
		
		
	}
}