package sheep;

import java.awt.*;

public class Hoof {
	private int height, width;
	
	void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
public void drawAt(int x, int y, Graphics pen){
	
	setHeightWidth(35, 30);
	
		pen.setColor(Color.BLACK);
		pen.fillRect(x-10, y+75, width, height);
		
	}
}