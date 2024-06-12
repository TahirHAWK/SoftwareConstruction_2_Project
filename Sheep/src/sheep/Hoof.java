package sheep;

import java.awt.*;

public class Hoof extends Organ{
	 
	public Hoof(int height, int width){
		super(height, width);
	}

public void drawAt(int left, int bottom){
	Drawing.pen().setColor(Color.BLACK);
	Drawing.pen().fillRect(left-10, bottom+75, super.getWidth(), super.getHeight());
		
	}

public void setSize(int size) {
	
	if(size == 1) {
		this.setHeight((int)(200 * 0.3182* 0.184));
		this.setWidth((int)(200 * 0.6603773 * 1.5* 0.0506));
	} else {
		this.setHeight((int)(600 * 0.3182* 0.184));
		this.setWidth((int)(600 * 0.6603773 * 1.5* 0.0506));
	}
}
}