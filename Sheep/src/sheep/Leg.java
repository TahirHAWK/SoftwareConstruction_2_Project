package sheep;

import java.awt.*;

public class Leg{
	private Hoof hoof;
	private int height, width;
	
	public void heightSetter(int height){
		this.height = height;
	}
	
	public void widthSetter(int width) {
		this.width = width;
	}
	
	Leg(){
		
	}
//	constructor initializing basic properties
	 Leg(int height, int width){
		heightSetter(height);
		widthSetter(width);
	}
	
public void drawAt(int x, int y, Graphics pen){
	 	
		pen.setColor(Color.GRAY);
//		height 110, width 20
		pen.fillRect(x, y, width, height);
		
		
		hoof = new Hoof(35, 30);
		hoof.drawAt(x, y, pen);
	}
}