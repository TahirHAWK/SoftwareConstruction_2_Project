package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Ear extends Organ{
	private int size;
//	height 100, width 40
	public Ear(int height, int width) {
		super(height, width);
	}
	
public void drawAt(int left, int bottom){
		
	Drawing.pen().setColor(Color.GRAY);
	Drawing.pen().fillOval(left+55, bottom+50, super.getHeight() , super.getWidth() );
		
	}
public void setSize(int size) {
	this.size = size;
	
	System.out.println(size + " ear");
	if(size == 1){
		this.setHeight((int)(200* 0.25 * 0.167));
		this.setWidth((int)( 200 * 0.6603773* 0.32 * 0.09));
	} else {
		this.setHeight((int)(600* 0.25* 0.167));
		this.setWidth((int)(600 * 0.6603773 * 0.32 * 0.09));		
		}
	}
}