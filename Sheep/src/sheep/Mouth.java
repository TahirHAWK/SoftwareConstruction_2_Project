package sheep;
import java.awt.Color;
import java.awt.Graphics;

public class Mouth extends Organ{
	
	public Mouth(int width, int height) {
		super(height, width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
		pen.setColor(Color.GRAY);
		pen.drawLine(left+10, bottom+155, left+super.getHeight(), bottom+super.getWidth());	
	}
}