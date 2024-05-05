package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Tail{
	private int height, width;
	
	public Tail(int height, int width) {
		setHeightWidth(height, width);
	}
	
	void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
public void drawAt(int left, int bottom, Graphics pen){
	
		pen.setColor(Color.darkGray);
		pen.fillOval(left+380, bottom+50, height, width);
		
	}
}