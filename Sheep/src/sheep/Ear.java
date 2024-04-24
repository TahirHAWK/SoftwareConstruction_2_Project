package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Ear {
		
	private int height, width;
	
	void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
public void drawAt(int x, int y, Graphics pen){
	
		setHeightWidth(100, 40);
			
		pen.setColor(Color.GRAY);
		pen.fillOval(x+55, y+50, height , width );
		
	}
}