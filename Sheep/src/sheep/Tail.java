package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Tail extends Organ{
	private int size;
	public Tail(int height, int width) {
		super(height, width);
	}

public void drawAt(int left, int bottom){
	
	Drawing.pen().setColor(Color.darkGray);
	Drawing.pen().fillOval(left+380, bottom+50, super.getHeight(), super.getWidth());
		
	}

public void setSize(int size) {
	 this.size = size;
	 if(size == 1) {
			this.setHeight((int)(200 *  0.0667));
			this.setWidth((int)( 200 * 0.6603773 * 0.0506));
		} else {
			this.setHeight((int)(600*  0.0667));
			this.setWidth((int)(600 * 0.6603773 * 0.0506));		
		}
}
}

