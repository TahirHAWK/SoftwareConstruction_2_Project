package sheep;
import java.awt.Color;
import java.awt.Graphics;

public class Mouth extends Organ{
	private int size;
	public Mouth(int width, int height) {
		super(height, width);
	}
	
public void drawAt(int left, int bottom){
	Drawing.pen().setColor(Color.GRAY);
//	Drawing.pen().drawLine(left+10, bottom+155, left+super.getHeight(), bottom+super.getWidth());
	Drawing.pen().drawLine(left+10, bottom+super.getWidth(), left+super.getHeight(), bottom+super.getWidth());
	System.out.println(super.getWidth() + " "+ super.getHeight());
	}
public void setSize(int size) {
	this.size = size;
	if(size == 1)
	{
		this.setHeight((int)(200 * 0.05833));
		this.setWidth((int)( 200 * 0.26));
	}else {
		this.setHeight((int)(600* 0.05833));
		this.setWidth((int)(600 * 0.26));		
		}
	}
}
