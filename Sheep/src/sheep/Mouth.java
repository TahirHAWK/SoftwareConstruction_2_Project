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
public void drawAt(int left, int bottom, Graphics pen){
		pen.setColor(Color.GRAY);
		pen.drawLine(left+10, bottom+155, left+height, bottom+width);	
	}
}