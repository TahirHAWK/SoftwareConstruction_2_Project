 package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Organ {
	private int height, width,x, y;
	
	public Organ(int height, int width) {
		setHeight(height);
		setWidth(width);
	}
	
	public boolean setX(int x) {
		this.x = x;
		return true;			
	
	}
	public boolean setY(int y) {
		this.y = y;
		return true;			
	
	}
	
	public int getX(){
		return x;			
	}

	public int getY(){
		return y;			
	}
	
	public boolean setHeight(int height) {
		this.height = height;
		return true;			
	
	}
	
	public boolean setWidth(int width) {
		this.width = width;
		return true;			
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
