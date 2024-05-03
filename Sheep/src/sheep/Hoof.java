package sheep;

import java.awt.*;

public class Hoof extends Leg{
	private int height, width;
	 
	public Hoof(int height, int width){
//		setHeightWidth(35, 30);
		heightSetter(height);
		widthSetter(width);
	}
	
//	public void setHeightWidth(int height, int width) {
//		this.height = height;
//		this.width = width;
//	}
	
	public void heightSetter(int height){
		this.height = height;
	}
	
	public void widthSetter(int width) {
		this.width = width;
	}
public void drawAt(int x, int y, Graphics pen){
		pen.setColor(Color.BLACK);
		pen.fillRect(x-10, y+75, width, height);
		
	}
}