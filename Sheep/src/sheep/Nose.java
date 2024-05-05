package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Nose {
	private int height, width;	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public Nose(int height, int width) {
		setHeightWidth(height, width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
		
		pen.setColor(Color.BLACK);
		//pen.fillOval(x+700, y+50, height , width);
		pen.drawLine(left+5, bottom+130, left+width, bottom+height);
		pen.drawLine(left+width, bottom+height, left+35 , bottom+130);
		pen.drawLine(left+width, bottom+height, left+width , bottom+155);
		
	}
}
