package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Nose {
	private int height, width;	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
//	height 100, width 40
	public Nose(int height, int width) {
		setHeightWidth(height, width);
	}
	
public void drawAt(int x, int y, Graphics pen){
		
		pen.setColor(Color.BLACK);
		//pen.fillOval(x+700, y+50, height , width);
		pen.drawLine(x+5, y+130, x+20, y+147);
		pen.drawLine(x+20, y+147, x+35 ,y+130);
		pen.drawLine(x+20, y+147, x+20 ,y+155);
		
	}
}
