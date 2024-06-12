package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Eye {
	
	private int whitePartWidth, blackPartWidth, whitePartHeight, blackPartHeight;
	private int height, width, size;
	
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

	public void setHeight(int height)
	{
		this.height = height;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setSize(int size) {
	this.size = size;
	 
	if(size == 1)
	{
		this.setHeight((int)(200));
		this.setWidth((int)( 200 * 0.6603773));
	}else {
		this.setHeight((int)(600));
		this.setWidth((int)(600 * 0.6603773));		
		}
	
	}
}