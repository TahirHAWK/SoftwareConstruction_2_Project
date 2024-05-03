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
		pen.drawLine(x+10, y+155, x+height, y+width);	
	}
}