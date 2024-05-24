package sheep;

import java.awt.Color;
import java.awt.*;

public class Leg extends Organ{
	private Hoof hoof; // composite

//	constructor initializing basic properties
	public Leg(int height, int width){
		super(height, width);
	}
	
public void drawAt(int left, int bottom){
	 	
		Drawing.pen().setColor(Color.GRAY);
//		height 110, width 20
		Drawing.pen().fillRect(left, bottom, super.getWidth(), super.getHeight());
		
		
		hoof = new Hoof(35, 30);
		hoof.drawAt(left, bottom);
	}
}