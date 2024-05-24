package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Tail extends Organ{
	
	public Tail(int height, int width) {
		super(height, width);
	}

public void drawAt(int left, int bottom){
	
	Drawing.pen().setColor(Color.darkGray);
	Drawing.pen().fillOval(left+380, bottom+50, super.getHeight(), super.getWidth());
		
	}
}