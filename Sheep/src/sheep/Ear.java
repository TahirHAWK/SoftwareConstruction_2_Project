package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Ear extends Organ{
	
//	height 100, width 40
	public Ear(int height, int width) {
		super(height, width);
	}
	
public void drawAt(int left, int bottom, Graphics pen){
		
		pen.setColor(Color.GRAY);
		pen.fillOval(left+55, bottom+50, super.getHeight() , super.getWidth() );
		
	}
}