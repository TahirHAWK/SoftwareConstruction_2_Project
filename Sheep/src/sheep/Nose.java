package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Nose extends Organ{
		
	public Nose(int height, int width) {
		super(height, width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
		
		pen.setColor(Color.BLACK);
		//pen.fillOval(x+700, y+50, height , width);
		pen.drawLine(left+5, bottom+130, left+super.getWidth(), bottom+super.getHeight());
		pen.drawLine(left+super.getWidth(), bottom+super.getHeight(), left+35 , bottom+130);
		pen.drawLine(left+super.getWidth(), bottom+super.getHeight(), left+super.getWidth() , bottom+155);
	}
}
