package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Eye {
	
	private int whitePartWidth, blackPartWidth, whitePartHeight, blackPartHeight;
	private int height, width;
	
		public void setEyePosition(int xAxis,int yAxis) {
			
			whitePartWidth = xAxis;
			blackPartWidth = xAxis + 5 ;
			whitePartHeight = yAxis;
			blackPartHeight = yAxis + 5;
			
		}
		
		public Eye(int xAxis, int yAxis, int height, int width) {
			setEyePosition(xAxis, yAxis);
			this.height = height;
			this.width = width;
		}
		
public void drawAt(int left, int bottom){
	
		
	Drawing.pen().setColor(Color.white);
	Drawing.pen().fillOval(left+whitePartWidth, bottom+whitePartHeight, (int)(height*0.05), (int)(height*0.05));
	Drawing.pen().setColor(Color.black);
	Drawing.pen().fillOval(left+blackPartWidth, bottom+blackPartHeight, (int)(width*0.042), (int)(width*0.042));
		
	}
}