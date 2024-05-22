 package sheep;

import java.awt.Color;
import java.awt.Graphics;

public class Organ {
	private int height, width;
	
	public Organ(int height, int width) {
		setHeight(height);
		setWidth(width);
	}
	
	public boolean setHeight(int height) {
		if(height != 0) {
			this.height = height;
			return true;			
		} else {
			return false;
		}
	}
	
	public boolean setWidth(int width) {
		if(width != 0) {
			this.width = width;
			return true;			
		} else {
			return false;
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
