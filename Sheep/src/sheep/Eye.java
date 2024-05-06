package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Eye {
	
	private int whitePartWidth, blackPartWidth, whitePartHeight, blackPartHeight;
	
		public void setEyePosition(int width,int height) {
			
			whitePartWidth = width;
			blackPartWidth = whitePartWidth + 5 ;
			whitePartHeight = height;
			blackPartHeight = whitePartHeight + 5;
			
		}
		
		public Eye(int xAxis, int yAxis) {
			setEyePosition(xAxis, yAxis);
		}
		
public void drawAt(int left, int bottom, Graphics pen){
	
		
		pen.setColor(Color.white);
		pen.fillOval(left+whitePartWidth, bottom+whitePartHeight, 30, 30);
		pen.setColor(Color.black);
		pen.fillOval(left+blackPartWidth, bottom+blackPartHeight, 16, 16);
		
	}
}