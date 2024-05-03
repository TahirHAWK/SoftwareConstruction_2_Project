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
	
public void drawAt(int x, int y, Graphics pen){
		
		pen.setColor(Color.BLACK);
		//pen.fillOval(x+700, y+50, height , width);
		pen.drawLine(x+5, y+130, x+width, y+height);
		pen.drawLine(x+width, y+height, x+35 ,y+130);
		pen.drawLine(x+width, y+height, x+width ,y+155);
		
	}
}
