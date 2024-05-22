package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Tail extends Organ{
	
	public Tail(int height, int width) {
		super(height, width);
	}

public void drawAt(int left, int bottom, Graphics pen){
	
		pen.setColor(Color.darkGray);
		pen.fillOval(left+380, bottom+50, super.getHeight(), super.getWidth());
		
	}
}