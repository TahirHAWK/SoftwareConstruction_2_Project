package sheep;

import java.awt.Color;
import java.awt.*;

public class Leg extends Organ{
	private Hoof hoof; // composite
	private int size;

//	constructor initializing basic properties
	public Leg(int height, int width, int size){
		super(height, width);
		this.size = size;
//		Hoof(35, 30)
//		110, 20
		hoof = new Hoof((int)(height* 0.3182),(int)( width* 1.5));
	}
	
public void drawAt(int left, int bottom){
	if(size == 0 || size == 3) {
// for large size	 	
		Drawing.pen().setColor(Color.GRAY);
//		height 110, width 20
		Drawing.pen().fillRect(left, bottom, super.getWidth(), super.getHeight());
		hoof.drawAt(left, bottom);
	} else {
//		for small size
		Drawing.pen().setColor(Color.GRAY);
//		height 110, width 20
		Drawing.pen().fillRect(left, bottom, super.getWidth(), super.getHeight());
		hoof.drawAt(left+7, bottom-45);		
	}
		
	}

public void setSize(int size) {
	this.size = size;
}
}