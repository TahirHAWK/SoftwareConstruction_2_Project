package sheep;

import java.awt.*;

public class Leg{
	private Hoof hoof; // composite
	private int height, width;
	
	public void heightSetter(int height){
		this.height = height;
	}
	
	public void widthSetter(int width) {
		this.width = width;
	}
//	default constructor 
	Leg(){	
	}
//	constructor initializing basic properties
	 Leg(int height, int width){
		heightSetter(height);
		widthSetter(width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
	 	
		pen.setColor(Color.GRAY);
//		height 110, width 20
		pen.fillRect(left, bottom, width, height);
		
		
		hoof = new Hoof(35, 30);
		hoof.drawAt(left, bottom, pen);
	}
}