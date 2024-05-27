package sheep;

import java.awt.Color;
import java.awt.*;

public class Leg extends Organ{
	private Hoof hoof; // composite

//	constructor initializing basic properties
	public Leg(int height, int width){
		super(height, width);
//		Hoof(35, 30)
//		110, 20
		hoof = new Hoof((int)(height* 0.3182),(int)( width* 1.5));
		System.out.println(height + ", " + width);
	}
	
public void drawAt(int left, int bottom){
	 	
		Drawing.pen().setColor(Color.GRAY);
//		height 110, width 20
		Drawing.pen().fillRect(left, bottom, super.getWidth(), super.getHeight());
		
		
		hoof.drawAt(left, bottom);
	}
}