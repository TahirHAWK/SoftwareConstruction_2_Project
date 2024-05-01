package sheep;

import java.awt.*;

public class Hoof {
	private int height, width;
	
	public Hoof(){
		setHeightWidth(35, 30);
	}
	
	public void setHeightWidth(int height, int width) {
		this.height = height;
		this.width = width;
	}
public void drawAt(int x, int y, Graphics pen){
	
	
		pen.setColor(Color.BLACK);
		pen.fillRect(x-10, y+75, width, height);
		
	}
}