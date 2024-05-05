package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Ear {
		
	private int height, width;
	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
//	height 100, width 40
	public Ear(int height, int width) {
		setHeightWidth(height, width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
		
		pen.setColor(Color.GRAY);
		pen.fillOval(left+55, bottom+50, height , width );
		
	}
}