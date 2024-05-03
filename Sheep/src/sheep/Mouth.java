package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Mouth {
	private int height, width;
		
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public Mouth(int width, int height) {
		setHeight(height);
		setWidth(width);
	}
	
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.GRAY);
//		pen.fillOval(x-120, y+50, 30, 15);
		//pen.drawArc(x-5, y+130, width,height, -180, 180);
		pen.drawLine(x+10, y+155, x+30, y+155);

		
	}
}